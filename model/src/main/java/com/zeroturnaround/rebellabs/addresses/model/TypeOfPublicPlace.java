package com.zeroturnaround.rebellabs.addresses.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TypeOfPublicPlace implements Serializable {

	private static final long serialVersionUID = 1L;

	private final Long id;

	private final String name;

}
