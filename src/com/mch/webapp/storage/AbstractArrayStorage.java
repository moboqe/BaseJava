package com.mch.webapp.storage;

import com.mch.webapp.model.Resume;

public abstract class AbstractArrayStorage implements Storage {
	protected static final int STORAGE_LIMIT = 10000;
	protected Resume[] storage = new Resume[STORAGE_LIMIT];
	protected int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public Resume get(String uuid) {
		int index = getIndex(uuid);
		if (index == -1) {
			System.out.println("Resume " + uuid + " not exists");
			return null;
		}
		return storage[index];
	}

	protected abstract int getIndex(String uuid);
}
