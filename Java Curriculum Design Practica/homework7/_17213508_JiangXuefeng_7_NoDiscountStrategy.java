package homework7;

public class _17213508_JiangXuefeng_7_NoDiscountStrategy extends _17213508_JiangXuefeng_7_PricingStrategy {
	public double getSubTotal(_17213508_JiangXuefeng_7_SaleLineItem item)
    {
        return item.getCopies() * item.getProdSpec().getPrice();
    }

    public String getType()
    {
        return "无优惠";
    }

    public String getPara()
    {
        return "null";
    }
}
