package com.example.ooad.domain;

public interface Specification<T> {
	/**
	 *  规约接口
	 * @param entity
	 * @Return
	 * */
	public boolean isSatisfiedBy(T entity);
}
