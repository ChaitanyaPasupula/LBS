package com.lbs.beans;

public class Lab {
	   private String labId;
		private String labName;
		private String location ;
		private String capacity ;
		private String status ;
	        public Lab()
	        {
	            
	        }
		public Lab(String labId,String labName,String location,String capacity,String status){
			this.labId=labId;
			this.labName=labName;
			this.location=location;
			this.capacity=capacity;
			this.status=status;
		}
		public String getLabId() {
			return labId;
		}
		public void setLabId(String labId) {
			this.labId = labId;
		}
		public String getLabName() {
			return labName;
		}
		public void setLabName(String labName) {
			this.labName = labName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getCapacity() {
			return capacity;
		}
		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
}
