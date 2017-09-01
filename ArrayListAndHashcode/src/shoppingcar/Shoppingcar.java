package shoppingcar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Shoppingcar {
	private double totalPrice;//购物车所有商品的总价格
	private int totalCount;//购物车所有的商品数量
	private Map<Integer, OrderItemBean> itemMap = new HashMap<Integer, OrderItemBean>();
	
	private Database database;
	public Shoppingcar() {
		// 初始化购物车
		database = new Database();
	} 
	public void buy(int nid) {
		//如果该商品是第一次购买，商品的信息从数据库获取。itemMap增加一对
		//键值对。如果不是第一次购买，则通过商品编号找到对应的订单项，然后更新
		//订单项的商品数量。不管是否第一次购买，都得更新购物车的总价格和总数量。
		if (itemMap.containsKey(nid)) {
			OrderItemBean itemBean = itemMap.get(nid);
			itemBean.setCount(itemBean.getCount()+1);
		}else {
			OrderItemBean itemBean = new OrderItemBean();
			itemBean.setMacbean(database.getMacbean(nid));
			itemBean.setCount(1);
			itemMap.put(nid, itemBean);
		}
	}
	
	public void delete(int nid) {
		//通过商品编号删除对应的订单项，然后从新更新购物车的总价格和总数量。
		if (itemMap.containsKey(nid)) {
			itemMap.remove(nid);
		} else {
			System.out.println("");
		}
	}
	
	public void update(int nid, int count) {
		//通过商品编号找到对应的订单项，修改商品数量。然后次更新购物车的总价格和总数量。
		if (itemMap.containsKey(nid)) {
			OrderItemBean itemBean = itemMap.get(nid);
			itemBean.setCount(count);
		}else {
			System.out.println("没有此商品");
		}
	}
	
	public void clear() {
		//清空订单项，购物车的总价格和总数量清零。
		itemMap.clear(); 
	}
	
	public double getTotalprice() {
		double totalPrice = 0;
		Collection collection = itemMap.values();
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			OrderItemBean order = (OrderItemBean) iterator.next();
			totalPrice += order.getMacbean().getNprice()*order.getCount();	
		}
		return totalPrice;
	}
	
	public int gettotalCount() {
		int totalCount = 0;
		Collection collection = itemMap.values();
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			OrderItemBean order = (OrderItemBean) iterator.next();
			totalCount += order.getCount();	
		}
		return totalCount; 
	}
	
	public void show() {
		//显示购物车的商品，格式如下：
		/*
		 * 商品编号	商品名称	单价	购买数量	总价
		 * 1		地瓜		2.0	2		4.0
		 * 2		衣服		30	5		150
		 * ...
		 * 
		 * 合计：总数量：5	总价格：20元
		 * */
		
		System.out.println("商品编号\t 商品名称\t 单价\t 购买数量\t 总价");
		Collection collection = itemMap.values();
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			OrderItemBean order = (OrderItemBean) iterator.next();
			System.out.println(order.getMacbean().getNid()+ "\t" 
			+order.getMacbean().getSname()+ "\t"+order.getMacbean().getNprice()
			+ "\t" +order.getCount()+ "\t" +order.getTotalPrice());
		}
	}
	
	
	
}
