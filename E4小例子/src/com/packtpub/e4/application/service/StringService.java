package com.packtpub.e4.application.service;
import org.eclipse.e4.core.di.annotations.Creatable;
@Creatable
public class StringService implements IStringService{
 public String process(String string) {
 return string.toUpperCase();
 }
}