package com.sdkjava.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdkjava.application.repository.TagRepository;
import com.sdkjava.application.wallet.Tag;


@Service
public class TagServiceImpl implements TagService{
	

	@Autowired
	private TagRepository tagRepostiroy;
	
	
	@Override
	public Optional<Tag> getTagByName(String tagName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Tag>> getAllTags() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteTag(Long tagId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tag createTag(String tagName) {
		// TODO Auto-generated method stub
		return null;
	}

}
