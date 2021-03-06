/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */
package hu.dpc.ob.rest.dto.ob.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import hu.dpc.ob.domain.entity.Payment;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuppressWarnings("unused")
public class PaymentCreateData extends PisData {

    @JsonProperty(value = "ConsentId", required = true)
    @NotEmpty
    @Size(max = 128)
    private String consentId;

    public PaymentCreateData(@NotEmpty @Size(max = 128) String consentId, @NotNull @Valid PisInitiationData initiation) {
        super(initiation);
        this.consentId = consentId;
    }

    String updateEntity(@NotNull Payment payment) {
        if (!consentId.equals(payment.getConsent().getConsentId()))
            return "Invalid consent identifier";
        return super.updateEntity(payment);
    }
}
