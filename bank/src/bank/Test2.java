package bank;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

// 원금만기일상환
public class Test2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
BigDecimal money = new BigDecimal(153000); // 원금
int term_i = 10; // 대출기간
BigDecimal term = new BigDecimal(360); // 대출 기간
BigDecimal twelve = new BigDecimal("12"); // 일년간 지불한 이자 기간 고정값이다. 12개월
BigDecimal rate = new BigDecimal(2.75);    // 이자율
BigDecimal hundred = new BigDecimal("100");
BigDecimal _rate_money = new BigDecimal(0);    // 이자
BigDecimal tot_rate = new BigDecimal("0"); // 총이자
_rate_money = money.multiply( (rate.divide(hundred,MathContext.DECIMAL128))).divide(twelve,MathContext.DECIMAL128);
//System.out.println(_rate_money);
DecimalFormat df = new DecimalFormat("#,##0");
for(int i = 1; i<=term_i;i++){
System.out.print("no : "+i+" | ");
if( i == term_i){
tot_rate = tot_rate.add(_rate_money);
System.out.print("상환금 : "+df.format(( _rate_money.add(money))) +" | " );
System.out.println("납입원금 : "+df.format(money) + " | 이자 : " + df.format(_rate_money) + " | 납입원금계 : "+money + "  |  잔금 : "+0);
}else{
tot_rate = tot_rate.add(_rate_money);
System.out.println("상환금 : "+df.format(_rate_money)+" | 납입원금 : " + 0 +"           | 이자 : " + df.format(_rate_money) + " | 납입원금계 :" + 0 + "  |  잔금 : " + money);
}
}
System.out.println("총이자 : "+df.format(tot_rate));
}

}
