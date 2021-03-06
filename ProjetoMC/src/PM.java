import java.util.ArrayList;
import java.util.List;

public class PM {
	
    public Float cpuCapacity;
    public Float memCapacity;
    public List<VM> allocatedVMs;
    
    public PM(Float cpuCapacity , Float memCapacity) {
    	this.cpuCapacity = cpuCapacity;
    	this.memCapacity = memCapacity;
    	this.allocatedVMs = new ArrayList<VM>();
    }

	public Float getCpuCapacity() {
		return cpuCapacity;
	}

	public void setCpuCapacity(Float cpuCapacity) {
		this.cpuCapacity = cpuCapacity;
	}

	public Float getMemCapacity() {
		return memCapacity;
	}

	public void setMemCapacity(Float memCapacity) {
		this.memCapacity = memCapacity;
	}

	public List<VM> getAllocatedVMs() {
		return allocatedVMs;
	}

	public void setAllocatedVMs(List<VM> allocatedVMs) {
		this.allocatedVMs = allocatedVMs;
	}
	
	public void allocateVirtualMachine(VM virtualMachine) {
		allocatedVMs.add(virtualMachine);
		
		this.memCapacity -= virtualMachine.getMemoryReq();
		this.cpuCapacity -= virtualMachine.getCpuReq();
	}

}
