package Model;
import Logical.StorageConverter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StorageConverterModel {
    StorageConverter logical = new StorageConverter();
    public String solve(String num , int unitForm , int unitTo)
    {
        String Ans = "";
        double numD = 0;
        if (num.length() > 0)
        {
             numD = Double.valueOf(num);
        }
        
        
        
        switch(unitForm)
        {
            case 0:
                Ans = logical.byte2GB(numD)+"";
                break;
            case 1:
                Ans = logical.kb2GB(numD)+"";
                break;
            case 2:
                Ans = logical.mb2GB(numD)+"";
                break;
            case 3:
                Ans = numD + "";
                break;
            case 4:
                Ans = logical.pb2GB(numD)+"";
                break;
            case 5:
                Ans = logical.tb2GB(numD)+"";
                break;
                
        }
        
        numD = Double.valueOf(Ans);
        
        switch(unitTo)
        {
            case 0:
                Ans = logical.gb2Byte(numD)+"";
                break;
            case 1:
                Ans = logical.gb2KB(numD)+"";
                break;
            case 2:
                Ans = logical.gb2MB(numD)+"";
                break;
            case 3:
                Ans = Ans;
                break;
            case 4:
                Ans = logical.gb2TB(numD)+"";
                break;
            case 5:
                Ans = logical.gb2PB(numD)+"";
                break;
                
        }
                
        if(Ans.contains(".0"))   
        {
            StringBuilder n = new StringBuilder(Ans);
            n.delete(n.length()-2, n.length());
            Ans = n.toString();
        }
        
        return Ans;
    }
}
