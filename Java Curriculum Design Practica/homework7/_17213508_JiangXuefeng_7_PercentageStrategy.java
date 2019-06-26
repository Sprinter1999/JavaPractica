package homework7;

import java.util.HashSet;

public class _17213508_JiangXuefeng_7_PercentageStrategy extends _17213508_JiangXuefeng_7_PricingStrategy {
    private int discountPercent = 0;

    public _17213508_JiangXuefeng_7_PercentageStrategy(int dis,HashSet<Integer> b,String i,String n)
    {
        super(b,i,n);
        discountPercent=dis;
    }

    public double getSubTotal(_17213508_JiangXuefeng_7_SaleLineItem i)
    {
        return i.getCopies()*i.getProdSpec().getPrice()*(100-discountPercent)/100;
    }

    public String getType()
    {
        return "百分比优惠政策";
    }

    public String getPara()
    {
        return String.valueOf(discountPercent);
    }
}
