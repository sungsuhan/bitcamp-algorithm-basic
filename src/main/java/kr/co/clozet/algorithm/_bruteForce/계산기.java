package kr.co.clozet.algorithm._bruteForce;

import kr.co.clozet.algorithm._greedy.최대최소값;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
/**
 * packageName:kr.co.clozet.algorithm._bruteForce
 * fileName        :계산기.java
 * author          : sungsuhan
 * date            :2022-05-25
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-25           sungsuhan      최초 생성
 **/
public class 계산기 {
    @Data
    @AllArgsConstructor
    static class Solution{

        private int num1;
        private String opcode;
        private int num2;
        @Override public String toString(){

            int res = 0;
            switch (opcode){
                case "+": res = num1 + num2; break;
                case "-": res = num1 - num2; break;
                case "*": res = num1 * num2; break;
                case "/": res = num1 / num2; break;
            }
            return num1 + " "+opcode+" "+num2 +" = "+res;
        }
    }
    @FunctionalInterface interface SolutionService {
        계산기.Solution solution(계산기.Solution s);
    }
    @Test
    void testSolution(){

    }
}
