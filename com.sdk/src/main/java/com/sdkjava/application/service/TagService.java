package com.sdkjava.application.service;

import java.util.List;
import java.util.Optional;

import com.sdkjava.application.wallet.Tag;


// CRUD

public interface TagService {
	
	
	public Optional<Tag> getTagByName(String tagName);
	
	public Optional<List<Tag>> getAllTags();
	
	public void deleteTag(Long tagId);
	
	public Tag createTag(String tagName);

}
