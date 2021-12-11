package edu.neu.csye6200.objects;

public class AgeGroup {

	private int ageGroupId;
	private int minLimitInMonths;
	private int maxLimitInMonths;
	private int maxGroupSize;
	private int maxGroupsPerRoom;
	private String ageGroupName;
        private int ageGroup;
        private int classroomId;
        private int maxCapacity;
        private int remainingCapacity;
        
        public AgeGroup(int ageGroupId, int ageGroup, int classroomId, int maxCapacity, int remainingCapacity  ) {
		try {
			this.ageGroupId = ageGroupId;
			this.ageGroup = ageGroup;
			this.classroomId = classroomId;
			this.maxCapacity = maxCapacity;
			this.remainingCapacity = remainingCapacity;
                        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public int getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(int ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setRemainingCapacity(int remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }
       
	
	public AgeGroup(String csvInput) {
		String[] inputs = csvInput.split(",");
		try {
			ageGroupId = Integer.parseInt(inputs[0]);
			ageGroupName = inputs[1];
			minLimitInMonths = Integer.parseInt(inputs[2]);
			maxLimitInMonths = Integer.parseInt(inputs[3]);
			maxGroupSize = Integer.parseInt(inputs[4]);
			maxGroupsPerRoom = Integer.parseInt(inputs[5]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(classroomId + " : ");
		output.append(minLimitInMonths + " to " + maxLimitInMonths + " months old ;");
		output.append("maxGroupSize: " + maxGroupSize + " members ;");
		output.append(maxGroupsPerRoom + " groups per room ;");
		return output.toString();
	}
	public int getMinLimitInMonths() {
		return minLimitInMonths;
	}
	public void setMinLimitInMonths(int minLimitInMonths) {
		this.minLimitInMonths = minLimitInMonths;
	}
	public int getMaxLimitInMonths() {
		return maxLimitInMonths;
	}
	public void setMaxLimitInMonths(int maxLimitInMonths) {
		this.maxLimitInMonths = maxLimitInMonths;
	}
	public int getMaxGroupSize() {
		return maxGroupSize;
	}
	public void setMaxGroupSize(int maxGroupSize) {
		this.maxGroupSize = maxGroupSize;
	}
	public int getMaxGroupsPerRoom() {
		return maxGroupsPerRoom;
	}
	public void setMaxGroupsPerRoom(int maxGroupsPerRoom) {
		this.maxGroupsPerRoom = maxGroupsPerRoom;
	}
}
