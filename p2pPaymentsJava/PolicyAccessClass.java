import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbPolicy;

public class PolicyAccessClass {

	public static String getPolicyProperty(String policyName, String propertyName) {
		
		try{
			MbPolicy policy = MbPolicy.getPolicy("UserDefined", policyName);
			return policy.getPropertyValueAsString(propertyName);
		} catch (MbException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
