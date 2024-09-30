package com.mch.webapp.storage;

import java.util.Arrays;

import com.mch.webapp.model.Resume;

public final class SortedArrayStorage extends AbstractArrayStorage {

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Resume r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Resume r) {
		// TODO Auto-generated method stub

	}

	@Override
	public Resume get(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String uuid) {
		// TODO Auto-generated method stub

	}

	@Override
	public Resume[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int getIndex(String uuid) {
		var searchKey = new Resume();
		searchKey.setUuid(uuid);
		return Arrays.binarySearch(storage, searchKey);
	}

}
