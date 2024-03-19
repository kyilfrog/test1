package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

	private Long id;
	private String itemName;
	private Integer price;
	private Integer quantity;
	// int 대신 Integer를 쓴 이유 : 값이 아무것도 안들어갈수도 있기 때문에
	// 예를 들어 int를 사용하면 price = 0 처럼 0이라도 값이 들어가야만 한다
	
	public Item() {
		
	}

	public Item(String itemName, Integer price, Integer quantity) {
		
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
}
