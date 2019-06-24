/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */
package hu.dpc.ob.rest.processor.ob.api;

import hu.dpc.ob.rest.processor.ValidateProcessor;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;


@Component("api-ob-validate-processor")
public class ApiValidateProcessor extends ValidateProcessor {

    @Override
    public void process(Exchange exchange) throws Exception {

    }
}