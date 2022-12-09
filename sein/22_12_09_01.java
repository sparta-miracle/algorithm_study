//프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 
//쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 
//시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int chicken) {   
        int coupon = chicken;       
        int overCoupon = 0;
        int serviceChicken = 0;
        
        while(coupon>9){
            serviceChicken += coupon/10;                //서비스 치킨 108개, 10개, 1개, 1개
            overCoupon = coupon%10;                     //남은쿠폰 1개, 9개, 9개, 0개     
            coupon = (coupon/10) + overCoupon;         //쿠폰은 109개, 19개, 10개, 1개   
         } 
        
        return serviceChicken;
    }
}
