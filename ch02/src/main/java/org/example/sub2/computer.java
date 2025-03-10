package org.example.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.naming.Name;

@Component("com")
public class computer {

    // 필드 주입
    @Autowired
    private Cpu cpu;

    @Autowired
    public computer(Rem rem) {
        this.rem = rem;
    }

    // 생성자 주입
    private Rem rem;

    // 세터주입
    @Autowired
    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    private Hdd hdd;




    public void show(){
        cpu.show();
        rem.show();
        hdd.show();

    }

}
