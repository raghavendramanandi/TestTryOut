package com.example.app.model;

import com.example.app.AppEnum.SHARE_TYPE;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.websocket.OnClose;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Bill {
    private double amount;
    private Group group;
    private List<Share> shares;
    private SHARE_TYPE shareType;

    public Bill(double amount, Group group, List<Share> shares, SHARE_TYPE share_type) {
        this.amount = amount;
        this.group = group;
        this.shares = shares;
        this.shareType = share_type;
    }

    public void validate() throws Exception {
        List<User> shareUsers = shares.stream().map(a -> a.getUser()).collect(Collectors.toList());
        if(!group.validate(shareUsers)){
            throw new Exception("Users does not belong to group");
        }
        if(amount< 0){
            throw new Exception("Amount should be greater than 0");
        }
        if(shareType == SHARE_TYPE.AMOUNT){
            if(shares.stream().map(a -> a.getDenomination()).mapToDouble(Double::doubleValue).sum() != amount){
                throw new Exception("Invalid Denomination");
            }
        }
        if(shareType == SHARE_TYPE.PERCENTAGE){
            if(shares.stream().map(a -> a.getDenomination()).mapToDouble(Double::doubleValue).sum() != 100){
                throw new Exception("Invalid Denomination");
            }
        }
    }
}
