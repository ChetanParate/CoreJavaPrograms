package sample.programs;

import java.util.ArrayList;
import java.util.List;

public class SampleAdd {
	
	private static String[] ebayItemsList = {"abc","cbd","wer","dfg"};
	private static String[] ItemsList = {"xyz","cbd","wer","asd"};
	
	public static List<String> getAddList(String[] ebayItemsList,String[] ItemsList){
		
		List<String> nonEbayItemForSflList = new ArrayList<>();
		for (String cartItem : ItemsList)
		{
			for (String ebayItemId :ebayItemsList)
			{
				if (!ebayItemId.equalsIgnoreCase(cartItem)) {
					nonEbayItemForSflList.add(cartItem);
					break;
				}
			}
		}
		return nonEbayItemForSflList;
		
	}
	
	public static void main(String[] args){
		
		List<String> nonEbayItemForSflList = getAddList(ebayItemsList,ItemsList);
		System.out.println(nonEbayItemForSflList);
		
		
		
	}

}
