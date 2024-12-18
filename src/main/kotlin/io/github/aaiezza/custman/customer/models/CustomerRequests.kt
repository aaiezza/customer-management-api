package io.github.aaiezza.custman.customer.models

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.aaiezza.custman.customer.models.Customer.*
import java.util.*

data class CreateCustomerRequest(
    @JsonProperty("full_name") val fullName: FullName,
    @JsonProperty("preferred_name") val preferredName: PreferredName,
    @JsonProperty("email_address") val emailAddress: EmailAddress,
    @JsonProperty("phone_number") val phoneNumber: PhoneNumber,
) {
    companion object
}

val CreateCustomerRequest.Companion.sample
    get() = CreateCustomerRequest(
        fullName = Customer.sample.fullName,
        preferredName = Customer.sample.preferredName,
        emailAddress = Customer.sample.emailAddress,
        phoneNumber = Customer.sample.phoneNumber,
    )

fun CreateCustomerRequest.toCustomerStub(): Stub = Stub(
    id = Id(UUID.randomUUID()),
    fullName = this.fullName,
    preferredName = this.preferredName,
    emailAddress = this.emailAddress,
    phoneNumber = this.phoneNumber,
)


data class UpdateCustomerRequest(
    @JsonProperty("full_name") val fullName: FullName? = null,
    @JsonProperty("preferred_name") val preferredName: PreferredName? = null,
    @JsonProperty("email_address") val emailAddress: EmailAddress? = null,
    @JsonProperty("phone_number") val phoneNumber: PhoneNumber? = null,
) {
    companion object
}

val UpdateCustomerRequest.Companion.sample
    get() = UpdateCustomerRequest(
        fullName = Customer.sample.fullName,
        preferredName = Customer.sample.preferredName,
        emailAddress = EmailAddress("johnny.doe@gmail.com"),
        phoneNumber = Customer.sample.phoneNumber,
    )
