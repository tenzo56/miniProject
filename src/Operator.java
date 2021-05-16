//运营端接口
interface Operator extends Bussiness {
    /**
     *
     * @param targetItemId 需要修改中奖率的商品编号
     * @param targetRate 目标中奖率
     */
    void changeHitRate(int targetItemId, float targetRate);
}
