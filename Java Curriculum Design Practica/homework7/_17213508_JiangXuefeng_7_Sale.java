package homework7;

import java.util.ArrayList;

public class _17213508_JiangXuefeng_7_Sale implements _17213508_JiangXuefeng_7_Subject
{
    /* The data field */
    private ArrayList<_17213508_JiangXuefeng_7_SaleLineItem> items = new ArrayList<>();

    /* The observer pattern */
    ArrayList<_17213508_JiangXuefeng_7_Observer> observers = new ArrayList<>();


    public _17213508_JiangXuefeng_7_Sale() {}

    /* The shopping method */
    public _17213508_JiangXuefeng_7_SaleLineItem add(_17213508_JiangXuefeng_7_SaleLineItem item)
    {
        items.add(item);
        notifyObservers();
        return item;
    }

    public double getTotal()
    {
        double temp = 0;
        for (_17213508_JiangXuefeng_7_SaleLineItem item : items)
            temp += item.getSubTotal();
        return temp;
    }

    public String[][] getCartInfo()
    {
        String[][] temp = new String[items.size()][];

        for (int i = 0; i < items.size(); i++)
        {
            _17213508_JiangXuefeng_7_SaleLineItem item = items.get(i);
            double oldPrice = item.getCopies() * item.getProdSpec().getPrice();
            double discount = oldPrice - item.getSubTotal();

            temp[i] = new String[]{
                    items.get(i).getProdSpec().getTitle(),
                    String.valueOf(items.get(i).getCopies()),
                    String.valueOf(oldPrice),
                    String.valueOf(discount)
            };
        }

        return temp;
    }

    /* The Subject method */
    @Override
    public void registerObserver(_17213508_JiangXuefeng_7_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(_17213508_JiangXuefeng_7_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (_17213508_JiangXuefeng_7_Observer observer : observers) {
            observer.update(this);
        }
    }
}
