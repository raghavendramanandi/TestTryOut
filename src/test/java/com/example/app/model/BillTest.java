package com.example.app.model;

import com.example.app.AppEnum.SHARE_TYPE;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class BillTest {
    @Test
    public void ShouldEvaluateTrueOnACorrecctBill() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("a"));
        users.add(new User("b"));
        users.add(new User("c"));
        List<Share> shares = new ArrayList<>();
        shares.add(new Share(new User("a"), 100));
        shares.add(new Share(new User("b"), 10));
        shares.add(new Share(new User("c"), 90));
        Bill bill = new Bill(200, new Group("g1", users), shares, SHARE_TYPE.AMOUNT);
        bill.validate();
    }
}