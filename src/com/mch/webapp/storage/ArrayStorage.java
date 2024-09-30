package com.mch.webapp.storage;

import java.util.Arrays;

import com.mch.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {
	private static final int STORAGE_LIMIT = 10000;
	private Resume[] storage = new Resume[STORAGE_LIMIT];
	private int size = 0;

	@Override
	public void clear() {
		Arrays.fill(storage, 0, size, null);
		size = 0;
	}

	@Override
	public void update(Resume r) {
		String uuid = r.getUuid();
		int index = getIndex(uuid);
		if (index == -1) {
			System.out.println("Resume " + uuid + " not exists");
		} else {
			storage[index] = r;
		}
	}

	@Override
	public void save(Resume r) {
		String uuid = r.getUuid();
		if (getIndex(uuid) != -1) {
			System.out.println("Resume " + uuid + " alreday exists");
		} else if (size == STORAGE_LIMIT) {
			System.out.println("Storage overflow");
		} else {
			storage[size] = r;
			size++;
		}
	}

	@Override
	public void delete(String uuid) {
		int index = getIndex(uuid);
		if (index == -1) {
			System.out.println("ERROR!!!");
		} else {
			storage[index] = storage[size - 1];
			storage[size - 1] = null;
			size--;
		}
	}

	/**
	 * @return array, contains only Resumes in storage (without null)
	 */
	@Override
	public Resume[] getAll() {
		return Arrays.copyOfRange(storage, 0, size);
	}

	@Override
	protected int getIndex(String uuid) {
		for (int i = 0; i < size; i++) {
			if (uuid.equals(storage[i].getUuid())) {
				return i;
			}
		}
		return -1;
	}
}
