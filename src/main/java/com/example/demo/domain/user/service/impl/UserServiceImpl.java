package com.example.demo.domain.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.user.model.MUser;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.repository.UserMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper mapper;
	
	//	ユーザー登録
	@Override
	public void signup(MUser user) {
		user.setDepartmentId(1);
		user.setRole("ROLE_GENERAL");
		mapper.insertOne(user);
		
	}
	//ユーザー取得
	@Override
	public List<MUser> getUsers(MUser user) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.findMany(user);
	}
	//ユーザー取得（１件）
	@Override
	public MUser getUserOne(String userId) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.findOne(userId);
	}
	//ユーザー更新（１件）
	@Override
	public void updateUserOne(String userId, String password, String userName) {
		// TODO 自動生成されたメソッド・スタブ
		mapper.updateOne(userId, password, userName);
	}
	//ユーザー削除（１件）
	@Override
	public void deleteUserOne(String userId) {
		// TODO 自動生成されたメソッド・スタブ
		int count = mapper.deleteOne(userId);
	}
}
