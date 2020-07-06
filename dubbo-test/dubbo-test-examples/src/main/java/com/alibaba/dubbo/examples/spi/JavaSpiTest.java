package com.alibaba.dubbo.examples.spi;

import java.util.ServiceLoader;

/**
 * Java SPI test.
 *
 * @author <a href="kangjinghang@gmail.com">kangjinghang</a>
 * @date 2020-07-06
 * @since 1.0.0
 */
public class JavaSpiTest {

    public static void main(String[] args) throws Exception{
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

}
