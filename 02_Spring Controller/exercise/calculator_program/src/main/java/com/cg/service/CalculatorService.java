package com.cg.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{

    @Override
    public String calculation(String firstInput, String secondInput, String calculation) {
        Double input1;
        Double input2;
        Double resultCaculation;
        String result = null;
        try {
            input1 = Double.parseDouble(firstInput);
            input2 = Double.parseDouble(secondInput);
            switch (calculation){
                case "Summation":
                    resultCaculation = input1 + input2;
                    result = String.valueOf(resultCaculation);
                    break;
                case "Subtraction":
                    resultCaculation = input1 - input2;
                    result = String.valueOf(resultCaculation);
                    break;
                case "Multiplication":
                    resultCaculation = input1 * input2;
                    result = String.valueOf(resultCaculation);
                    break;
                case "Division":
                    resultCaculation = input1 / input2;
                    if(input2 == 0){
                        result ="Khong the cho so 0";
                    }else {
                        result = String.valueOf(resultCaculation);
                    }
                    break;

            }
        }catch (NumberFormatException e){
           e.printStackTrace();
           result ="Dinh dang sai";
        }
        return result;
    }




}

