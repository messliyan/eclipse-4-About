/*
 *ITreeEntry.java2019年2月15日
 *
 */
package model;

import java.util.List;

/**
 *
 *@author 李佳斌
 */
public interface ITreeEntry<T> {
 public String getName();
 public void setName(String name);
 public void setChildren(List<T>children);
 public List<T>getChildren();
}
