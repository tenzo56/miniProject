/**
 * 商家端接口
  */
interface Bussiness extends User{
    /**
     *
     * @param itemId 商品编号
     * @param itemName 商品名称
     * @param stock 商品库存
     * @param regularPrice 常规价格
     * @param discount 促销价格
     * @param hitRate 中奖率
     */
    void setItem(int itemId, String itemName, int stock, int regularPrice, int discount, float hitRate);
    void changeItemPrice(int targetItemId, int targetPrice);
    void changeStock(int targetItemId, int targetStock);
}