package homework7;

public class _17213508_JiangXuefeng_7_SaleLineItem 
{
    private int copies=0;
    private _17213508_JiangXuefeng_7_BookSpecification prodSpec =null;
    private _17213508_JiangXuefeng_7_PricingStrategy strategy =null;

    public _17213508_JiangXuefeng_7_SaleLineItem(int c,_17213508_JiangXuefeng_7_BookSpecification p,_17213508_JiangXuefeng_7_PricingStrategy s)
    {
        this.copies=c;
        this.prodSpec=p;
        this.strategy=s;
    }

    public int getCopies()
    {
        return copies;
    }

    public _17213508_JiangXuefeng_7_BookSpecification getProdSpec()
    {
        return prodSpec;
    }

    public double getSubTotal()
    {
        return strategy.getSubTotal(this);
    }
}
