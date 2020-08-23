package main;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static java.lang.String.valueOf;

public class Employee {
    //無名クラスの基クラス
    //情報は社員情報
    private String employeeName;
    private int employeeNum;

    //Constructor
    Employee(String name,int num){
        this.employeeName = name;
        this.employeeNum = num;
    }


    public String getEmployeeData(){
        StringBuilder employeeData = new StringBuilder();

        //StringBuilderにて文字列を生成

        employeeData.append("従業員番号:");
        employeeData.append(this.employeeNum);
        employeeData.append("_");
        employeeData.append("氏名:");
        employeeData.append(this.employeeName);


        return employeeData.toString();
    }

    // Name getter,setter
    public void setEmployeeName(String name){
        this.employeeName = name;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }

    // Num getter,setter
    public void setEmployeeNum(int num){
        this.employeeNum = num;
    }
    public int getEmployeeNum(){
        return this.employeeNum;
    }


}
