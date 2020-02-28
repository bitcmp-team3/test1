package bank;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

// 원금 균등상환
public class Test {

public static void main(String[] args) {
// TODO Auto-generated method stub
BigDecimal tot = new BigDecimal("153000000"); // 대출 금액
int I_cnt=360;
BigDecimal cnt = new BigDecimal("360"); // 대출 기간
BigDecimal rate = new BigDecimal("2.75"); // 이자
BigDecimal hundred = new BigDecimal("100");  //이자 백분위
BigDecimal year = new BigDecimal("12");  //년 단위 이자율 
BigDecimal one = new BigDecimal("0"); // 납입원금
one = tot.divide(cnt,MathContext.DECIMAL128 ); // 납입원금
//System.out.println(one);
BigDecimal one_tot = new BigDecimal("0");  //납입원금계
BigDecimal k_t = new BigDecimal("0");  //총이자
BigDecimal k = new BigDecimal("0");  //매달 이자
BigDecimal t = new BigDecimal("0");  //상환금
DecimalFormat df = new DecimalFormat("#,##0");
for(int i=1;i<=I_cnt;i++)
{
k = ((tot.multiply(rate)).divide(hundred, MathContext.DECIMAL128)).divide(year, MathContext.DECIMAL128);  // 매달 이자
k_t = k_t.add(k); // 총이자
tot = tot.subtract(one); // 잔금
one_tot = one_tot.add(one); // 납입원금계
t = k.add(one); // 상환금
// System.out.println(k_t);
System.out.println("No :" + i + " 상환금 : "+ df.format(t) +" 납입원금 : "+df.format(one)+" 이자 : "+df.format(k)+" 납입원금계 : "+df.format(one_tot)+" 잔금 : " +df.format(tot));
}
System.out.println("총이자 : " + df.format(k_t));
}

}

