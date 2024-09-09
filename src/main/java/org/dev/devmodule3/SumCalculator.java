package org.dev.devmodule3;

public class SumCalculator {
        public int sum(int number){
            int sum = 0;

            for(int i = 0; i <= number; i++){
                sum+=i;
            }

            if(sum == 0){
                throw new IllegalArgumentException("Something went wront");
            }else return sum;
        }
}
