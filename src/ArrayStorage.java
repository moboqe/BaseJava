/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
	Resume[] storage = new Resume[10000];
	private int size = 0;

	void clear() {
	}
	
	void update(Resume r) {
	}
	
	void save(Resume r) {
		if (uuuid == storage[i].getUuid()) {
			return storage[i];
		}
	}

	Resume get(String uuid) {
		for (int i = 0; i < size; i++) {
			if (uuuid == storage[i].getUuid()) {
				return storage[i];
			}
		}
		return null;
	}

	void delete(String uuid) {
		for (int i = 0; i < size; i++) {
			if (uuuid == storage[i].getUuid()) {
				storage[i] = storage[size - 1];
				storage[i] = null;
				size--;
			}
		}
	}

	/**
	 * @return array, contains only Resumes in storage (without null)
	 */
	Resume[] getAll() {
		return new Resume[0];
	}

	int size() {
		return size;
	}
}
