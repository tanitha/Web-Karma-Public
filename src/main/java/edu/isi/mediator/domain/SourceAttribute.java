/*******************************************************************************
 * Copyright 2012 University of Southern California
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *  
 *    This code was developed by the Information Integration Group as part 
 *    of the Karma project at the Information Sciences Institute of the 
 *    University of Southern California.  For more information, publications, 
 *    and related projects, please see: http://www.isi.edu/integration
 ******************************************************************************/

package edu.isi.mediator.domain;

import edu.isi.mediator.domain.DomainAttribute;
import edu.isi.mediator.gav.util.MediatorConstants;

public class SourceAttribute extends DomainAttribute{
	
	public boolean needsBinding;
	
	public SourceAttribute(String name, String type, String bound){
		super(name, type);

		if(bound.equals("B"))
			this.needsBinding=true;
		else
			this.needsBinding=false;
	}

	public boolean needsBinding(){
		return needsBinding;
	}
	
	public String toString(){
		String s = "";
		s += name + ":" + type + ":";
		if(needsBinding)
			s += MediatorConstants.BOUND;
		else s +=MediatorConstants.FREE;
		return s;
	}

}
