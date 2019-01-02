package com.example

import java.lang.reflect.Method

import org.springframework.util.ReflectionUtils

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional

@Transactional
@GrailsCompileStatic
class ReflectionService {

    public <T> List<T> getAll(Class<T> klass, List ids) {
        Method method = ReflectionUtils.findMethod(klass, 'getAll', Iterable)
        return (List) ReflectionUtils.invokeMethod(method, (Object) null, ids)
    }
}
