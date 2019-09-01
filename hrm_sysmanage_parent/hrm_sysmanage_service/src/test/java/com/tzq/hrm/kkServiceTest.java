package com.tzq.hrm;

import com.tzq.hrm.domain.Systemdictionaryitem;
import com.tzq.hrm.service.ISystemdictionaryitemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Sysmanage9001Application.class)
public class kkServiceTest {
    @Autowired
    private ISystemdictionaryitemService systemdictionaryitemService;
    @Test
    public void test()throws Exception{
        List <Systemdictionaryitem> systemdictionaryitems = systemdictionaryitemService.selectList(null);
        for (Systemdictionaryitem systemdictionaryitem : systemdictionaryitems) {
            System.out.println(systemdictionaryitem);
        }

    }
}
