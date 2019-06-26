package homework7;

import java.util.HashSet;

public class _17213508_JiangXuefeng_7_PricingStrategyFactory {
	 	private static _17213508_JiangXuefeng_7_PricingStrategyFactory instrance;

	    private _17213508_JiangXuefeng_7_StrategyCatalog catalog;

	    private _17213508_JiangXuefeng_7_PricingStrategyFactory()
	    {
	        catalog = new _17213508_JiangXuefeng_7_StrategyCatalog();
	    }

	    static public _17213508_JiangXuefeng_7_PricingStrategyFactory getInstance()
	    {
	        if(null==instrance)
	            instrance= new _17213508_JiangXuefeng_7_PricingStrategyFactory();
	        return instrance;
	    }

	    public _17213508_JiangXuefeng_7_PricingStrategy getStrategyOfBook(int ty)
	    {
	        return catalog.getStrategyOfBook(ty);
	    }

	    public _17213508_JiangXuefeng_7_PricingStrategy getPricingStrategy(String ID)
	    {
	        return catalog.get(ID);
	    }

	    public _17213508_JiangXuefeng_7_PricingStrategy removePricingStrategy(String ID)
	    {
	        return catalog.remove(ID);
	    }

	    public String[][] getAllStratetiesInfo()
	    {
	        return catalog.getAllData();
	    }

	    public _17213508_JiangXuefeng_7_PricingStrategy createPricingStrategy(int t,Object p,HashSet<Integer> b, String I, String n)
	        throws Exception
	    {
	        if(catalog.get(I)!=null)
	            throw new Exception("一存在想通编号的策略");

	        for(int j:b)
	            if(!catalog.getStrategyOfBook(j).getType().equals("无优惠"))
	                throw new Exception(_17213508_JiangXuefeng_7_BookSpecification.toStr[j]+"已被绑定！");

	        _17213508_JiangXuefeng_7_PricingStrategy temp=null;

	        switch (t)
	        {
	            case _17213508_JiangXuefeng_7_IPricingStrategy.FlatRate:
	                temp=catalog.add(new _17213508_JiangXuefeng_7_FlatRateStrategy(Double.parseDouble(p.toString()),b,I,n));
	                break;

	            case _17213508_JiangXuefeng_7_IPricingStrategy.Percentage:
	                temp=catalog.add(new _17213508_JiangXuefeng_7_PercentageStrategy(Integer.parseInt(p.toString()),b,I,n));
	                break;

	            case _17213508_JiangXuefeng_7_IPricingStrategy.Composit:
	                String[] list=p.toString().split("\\|");
	                for(String stra:list)
	                    if(catalog.get(stra)==null) throw new Exception("输入的简单策略编号无效！");
	                temp=catalog.add(new _17213508_JiangXuefeng_7_CompositeBestForCustomer(list,b,I,n));
	                break;

	            case _17213508_JiangXuefeng_7_IPricingStrategy.NoDiscount:
	                 temp=catalog.add(new _17213508_JiangXuefeng_7_NoDiscountStrategy());

	                 default:
	                     return null;
	        }
	        if(temp==null)
	            throw new Exception("参数无效！");
	        return temp;
	    }
}
