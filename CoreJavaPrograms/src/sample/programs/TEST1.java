package sample.programs;
import java.math.BigDecimal;

public class TEST1 {
               
                public static void main(String[] args) {
                               
                                //input sale price, quantity, total adjustment , commission rate respectively.
                               
                                findUnitCost("0","1","-0.75","0.15");
                               
 
                }
                private  static  void findUnitCost( String salePrice, String quantity, String totalAdj,String commissionRate){
                               
                                  BigDecimal finalSalePrice;
         
          if (null!=totalAdj && !totalAdj.isEmpty()){
                   
              finalSalePrice=new BigDecimal(salePrice).subtract(new BigDecimal (totalAdj).divide(new BigDecimal (quantity)));
          }
          else{
             
              finalSalePrice=new BigDecimal(salePrice);
          }
             
          if (commissionRate != null)
          {
                                 
              BigDecimal commissionAmt = finalSalePrice.multiply(new BigDecimal(commissionRate)).setScale(2,
                      BigDecimal.ROUND_UP);
              System.out.println( "Unit cost is :" +(finalSalePrice.subtract(commissionAmt)));
          }
                }
               
}