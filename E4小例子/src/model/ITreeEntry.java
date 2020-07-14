/*
 *ITreeEntry.java2019��2��15��
 *
 */
package model;

import java.util.List;

/**
 *
 *@author ��ѱ�
 */
public interface ITreeEntry<T> {
 public String getName();
 public void setName(String name);
 public void setChildren(List<T>children);
 public List<T>getChildren();
}
