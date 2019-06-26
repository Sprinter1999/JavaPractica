package homework7;

import java.util.HashMap;

public class _17213508_JiangXuefeng_7_StrategyCatalog {
	public static final String[] ToStr = {"绝对值优化策略","百分比优惠策略","顾客优化策略"};
    //

    private HashMap<String,_17213508_JiangXuefeng_7_PricingStrategy> strategis= new HashMap<>();

    public _17213508_JiangXuefeng_7_StrategyCatalog()
    {
    	
    }

    public _17213508_JiangXuefeng_7_PricingStrategy get(String ID)
    {
        return strategis.get(ID);
    }

    public _17213508_JiangXuefeng_7_PricingStrategy remove(String ID)
    {
        return strategis.remove(ID);
    }

    public int size()
    {
        return strategis.size();
    }

    public _17213508_JiangXuefeng_7_PricingStrategy add(_17213508_JiangXuefeng_7_PricingStrategy st)
    {
        strategis.put(st.getID(),st);
        return st;
    }

    public String[][] getAllData()
    {
        int i=0;
        String[][] data=new String[strategis.size()][];

        for(_17213508_JiangXuefeng_7_PricingStrategy stra:strategis.values())
        {
            data[i]=new String[]{
                stra.getID(),
                    stra.getName(),
                    stra.getType(),
                    stra.getBookTypes(),
                    stra.getPara()
            };

            i++;
        }

        return data;
    }

    public _17213508_JiangXuefeng_7_PricingStrategy getStrategyOfBook(int type)
    {
        for(_17213508_JiangXuefeng_7_PricingStrategy st:strategis.values())
        {
            if(st.containBook(type))
                return st;
        }

        return new _17213508_JiangXuefeng_7_NoDiscountStrategy();
    }
}
