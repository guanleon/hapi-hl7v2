package ca.uhn.hl7v2.model.v24.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v24.group.*;

import ca.uhn.hl7v2.model.v24.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a OMN_O07 message structure (see chapter 4). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: OMN_O07_PATIENT (a Group object) <b>optional </b><br>
 * 3: OMN_O07_ORDER (a Group object) <b>repeating</b><br>
 */
public class OMN_O07 extends AbstractMessage  {

	/** 
	 * Creates a new OMN_O07 Group with custom ModelClassFactory.
	 */
	public OMN_O07(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new OMN_O07 Group with DefaultModelClassFactory. 
	 */ 
	public OMN_O07() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(OMN_O07_PATIENT.class, false, false);
	      this.add(OMN_O07_ORDER.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OMN_O07 - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns MSH (Message Header) - creates it if necessary
	 */
	public MSH getMSH() { 
	   MSH ret = null;
	   try {
	      ret = (MSH)this.get("MSH");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of NTE (Notes and Comments) - creates it if necessary
	 */
	public NTE getNTE() { 
	   NTE ret = null;
	   try {
	      ret = (NTE)this.get("NTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NTE
	 * (Notes and Comments) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NTE getNTE(int rep) throws HL7Exception { 
	   return (NTE)this.get("NTE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NTE 
	 */ 
	public int getNTEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NTE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns OMN_O07_PATIENT (a Group object) - creates it if necessary
	 */
	public OMN_O07_PATIENT getPATIENT() { 
	   OMN_O07_PATIENT ret = null;
	   try {
	      ret = (OMN_O07_PATIENT)this.get("PATIENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of OMN_O07_ORDER (a Group object) - creates it if necessary
	 */
	public OMN_O07_ORDER getORDER() { 
	   OMN_O07_ORDER ret = null;
	   try {
	      ret = (OMN_O07_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMN_O07_ORDER
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMN_O07_ORDER getORDER(int rep) throws HL7Exception { 
	   return (OMN_O07_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMN_O07_ORDER 
	 */ 
	public int getORDERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORDER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

}