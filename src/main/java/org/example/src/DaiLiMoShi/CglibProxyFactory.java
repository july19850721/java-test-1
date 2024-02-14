package org.example.src.DaiLiMoShi;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> clazz) {
        Enhancer en = new Enhancer();
        //设置代理的父类
        en.setSuperclass(clazz);
        //设置方法回调
        en.setCallback(this);
        //创建代理实例
        return (T) en.create();
    }

    @Override
    //参数中的object是目标对象，method和args是目标对象的方法和参数，methodProxy是方法代理
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        if ("loadAudio".equals(method.getName())) {
            //通过继承的方法实现代理，因此这里调用invokeSuper
            result = methodProxy.invokeSuper(object, args);
        }
        if ("playAudio".equals(method.getName())) {
            result = methodProxy.invokeSuper(object, args);
        }
        return result;
    }
}
