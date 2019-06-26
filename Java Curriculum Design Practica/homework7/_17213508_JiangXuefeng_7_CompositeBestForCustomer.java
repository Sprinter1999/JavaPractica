package homework7;

import java.util.HashSet;

public class _17213508_JiangXuefeng_7_CompositeBestForCustomer extends _17213508_JiangXuefeng_7_CompositeStrategy
{
    static final int MAX_TOTAL = 2015211301;

    /* The constructor method */
    public _17213508_JiangXuefeng_7_CompositeBestForCustomer(String[] list, HashSet<Integer> book, String ID, String name)
    {
        super(list, book, ID, name);
    }

    @Override
    public double getSubTotal(_17213508_JiangXuefeng_7_SaleLineItem item)
    {
        double best = MAX_TOTAL, temp;


        for (String name : strategies)
        {
            temp = _17213508_JiangXuefeng_7_PricingStrategyFactory.getInstance().getPricingStrategy(name).getSubTotal(item);
            best = best > temp ? temp: best;
        }
        return best;
    }

    @Override
    public String getType()
    {
        return "顾客最优策略";
    }

}
