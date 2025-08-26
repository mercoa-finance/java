# Reference
## Contract
<details><summary><code>client.contract.generateContract(request) -> GenerateContractResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a new contract object from a Base64 encoded PDF of a contract. This endpoint will block until the contract is generated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().generateContract(
    GenerateContractRequest
        .builder()
        .document("data:application/pdf;base64,JVBERi0xLjEKJcKlwrHDqwoKMSAwIG9iagogIDw8IC9UeXBlIC9DYXRhbG9nCiAgICAgL1BhZ2VzIDIgMCBSCiAgPj4KZW5kb2JqCgoyIDAgb2JqCiAgPDwgL1R5cGUgL1BhZ2VzCiAgICAgL0tpZHMgWzMgMCBSXQogICAgIC9Db3VudCAxCiAgICAgL01lZGlhQm94IFswIDAgMzAwIDE0NF0KICA+PgplbmRvYmoKCjMgMCBvYmoKICA8PCAgL1R5cGUgL1BhZ2UKICAgICAgL1BhcmVudCAyIDAgUgogICAgICAvUmVzb3VyY2VzCiAgICAgICA8PCAvRm9udAogICAgICAgICAgIDw8IC9GMQogICAgICAgICAgICAgICA8PCAvVHlwZSAvRm9udAogICAgICAgICAgICAgICAgICAvU3VidHlwZSAvVHlwZTEKICAgICAgICAgICAgICAgICAgL0Jhc2VGb250IC9UaW1lcy1Sb21hbgogICAgICAgICAgICAgICA+PgogICAgICAgICAgID4+CiAgICAgICA+PgogICAgICAvQ29udGVudHMgNCAwIFIKICA+PgplbmRvYmoKCjQgMCBvYmoKICA8PCAvTGVuZ3RoIDU1ID4+CnN0cmVhbQogIEJUCiAgICAvRjEgMTggVGYKICAgIDAgMCBUZAogICAgKEhlbGxvIFdvcmxkKSBUagogIEVUCmVuZHN0cmVhbQplbmRvYmoKCnhyZWYKMCA1CjAwMDAwMDAwMDAgNjU1MzUgZiAKMDAwMDAwMDAxOCAwMDAwMCBuIAowMDAwMDAwMDc3IDAwMDAwIG4gCjAwMDAwMDAxNzggMDAwMDAgbiAKMDAwMDAwMDQ1NyAwMDAwMCBuIAp0cmFpbGVyCiAgPDwgIC9Sb290IDEgMCBSCiAgICAgIC9TaXplIDUKICA+PgpzdGFydHhyZWYKNTY1CiUlRU9GCg==")
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `GenerateContractRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.generateContractRunAsync(request) -> GenerateContractAsyncResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a new contract object from a Base64 encoded PDF of a contract. This endpoint will return immediately and the contract will be generated asynchronously.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().generateContractRunAsync(
    GenerateContractRequest
        .builder()
        .document("data:application/pdf;base64,JVBERi0xLjEKJcKlwrHDqwoKMSAwIG9iagogIDw8IC9UeXBlIC9DYXRhbG9nCiAgICAgL1BhZ2VzIDIgMCBSCiAgPj4KZW5kb2JqCgoyIDAgb2JqCiAgPDwgL1R5cGUgL1BhZ2VzCiAgICAgL0tpZHMgWzMgMCBSXQogICAgIC9Db3VudCAxCiAgICAgL01lZGlhQm94IFswIDAgMzAwIDE0NF0KICA+PgplbmRvYmoKCjMgMCBvYmoKICA8PCAgL1R5cGUgL1BhZ2UKICAgICAgL1BhcmVudCAyIDAgUgogICAgICAvUmVzb3VyY2VzCiAgICAgICA8PCAvRm9udAogICAgICAgICAgIDw8IC9GMQogICAgICAgICAgICAgICA8PCAvVHlwZSAvRm9udAogICAgICAgICAgICAgICAgICAvU3VidHlwZSAvVHlwZTEKICAgICAgICAgICAgICAgICAgL0Jhc2VGb250IC9UaW1lcy1Sb21hbgogICAgICAgICAgICAgICA+PgogICAgICAgICAgID4+CiAgICAgICA+PgogICAgICAvQ29udGVudHMgNCAwIFIKICA+PgplbmRvYmoKCjQgMCBvYmoKICA8PCAvTGVuZ3RoIDU1ID4+CnN0cmVhbQogIEJUCiAgICAvRjEgMTggVGYKICAgIDAgMCBUZAogICAgKEhlbGxvIFdvcmxkKSBUagogIEVUCmVuZHN0cmVhbQplbmRvYmoKCnhyZWYKMCA1CjAwMDAwMDAwMDAgNjU1MzUgZiAKMDAwMDAwMDAxOCAwMDAwMCBuIAowMDAwMDAwMDc3IDAwMDAwIG4gCjAwMDAwMDAxNzggMDAwMDAgbiAKMDAwMDAwMDQ1NyAwMDAwMCBuIAp0cmFpbGVyCiAgPDwgIC9Sb290IDEgMCBSCiAgICAgIC9TaXplIDUKICA+PgpzdGFydHhyZWYKNTY1CiUlRU9GCg==")
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `GenerateContractRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.generateContractGetAsync(jobId) -> GenerateContractAsyncJobResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the status and results of an asynchronous contract generation job.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().generateContractGetAsync("cntgen_d6734204-ae46-4fe9-a0c5-bd2763d40c9b");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — Job ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.previewInvoices(request) -> List&lt;InvoiceResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate previews of the invoices that will be created from the provided contract.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().previewInvoices(
    PreviewContractInvoicesRequest
        .builder()
        .contract(
            ContractCreateRequest
                .builder()
                .summary("Contract Start Date: January 29, 2025\nParties to the Agreement:\n- Provider (Vendor): [Vendor Name] - Client (Payer): [Client Name]\nFees and Payment Terms:\n- Monthly Recurring Fee: \\$20.00 - Payment Schedule: Fees are payable in advance on the 1st day of each month. - First Payment Date: February 1, 2025 - Payment Method: Via credit card to the account designated by Provider. - Payment Due Date: Payment is due 5 days after the invoice date.\n")
                .recurrences(
                    new ArrayList<ContractRecurrenceCreateRequest>(
                        Arrays.asList(
                            ContractRecurrenceCreateRequest
                                .builder()
                                .rrule("DTSTART:20250201T000000ZRRULE:FREQ=MONTHLY;INTERVAL=1;BYMONTHDAY=1")
                                .justification("Monthly recurring fee billed in advance on the 1st of each month")
                                .filteredContractSummary("Contract Start Date: January 29, 2025\nParties to the Agreement:\n- Provider (Vendor): [Vendor Name] - Client (Payer): [Client Name]\nFees and Payment Terms:\n- Monthly Recurring Fee: \\$20.00 - Payment Schedule: Fees are payable in advance on the 1st day of each month. - First Payment Date: February 1, 2025 - Payment Method: Via credit card to the account designated by Provider. - Payment Due Date: Payment is due 5 days after the invoice date.\n")
                                .invoiceSchema(
                                    ContractInvoiceSchema
                                        .builder()
                                        .lineItems(
                                            new ArrayList<ContractInvoiceLineItemSchema>(
                                                Arrays.asList(
                                                    ContractInvoiceLineItemSchema
                                                        .builder()
                                                        .name("Monthly Subscription Service Fee")
                                                        .unitPrice(20)
                                                        .currency(CurrencyCode.USD)
                                                        .quantity(1)
                                                        .build()
                                                )
                                            )
                                        )
                                        .build()
                                )
                                .build()
                        )
                    )
                )
                .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
                .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
                .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                .build()
        )
        .invoiceIndexes(
            new ArrayList<Integer>(
                Arrays.asList(0)
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contract:** `ContractCreateRequest` — Contract to preview invoice creation for
    
</dd>
</dl>

<dl>
<dd>

**invoiceIndexes:** `List<Integer>` — Indexes of the invoices to generate from each recurrence (e.g. [0, 1, 2] for the first three invoices).  Note that contracts with multiple recurrences will generate more preview invoices, and invalid invoice indexes will be ignored silently. For example, [0, 1, 2] on a contract with 2 recurrences will generate at most 6 invoices, and potentially fewer if some of indexes are out of bounds for a recurrence.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.applyContractFeedback(contractId, request) -> ContractResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Apply feedback to a contract, generating an updated contract object.  NOTE: This works by re-extracting the contract details with the provided feedback in mind.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().applyContractFeedback(
    "cnt_3bd62b69-3835-433e-829f-4388a2e46c41",
    ApplyContractFeedbackRequest
        .builder()
        .feedback("Change the monthly fee to $20.00")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contractId:** `String` — Contract ID
    
</dd>
</dl>

<dl>
<dd>

**feedback:** `String` — Natural language feedback to apply to the contract
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.applyInvoiceFeedback(contractId, request) -> InvoiceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Apply feedback to an invoice, generating an updated invoice object.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().applyInvoiceFeedback(
    "cnt_3bd62b69-3835-433e-829f-4388a2e46c41",
    ApplyInvoiceFeedbackRequest
        .builder()
        .feedback("There were 2 subscriptions this month")
        .invoiceId("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contractId:** `String` — Contract ID
    
</dd>
</dl>

<dl>
<dd>

**feedback:** `String` — Natural language feedback to apply to the invoice
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `String` — ID of the invoice to apply feedback to
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.find() -> FindContractResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search contracts for all entities in the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().find(
    FindContractRequest
        .builder()
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**creatorEntityId:** `Optional<String>` — ID of the entity that created the contracts
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.create(request) -> ContractResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().create(
    ContractCreateRequest
        .builder()
        .summary("Contract Start Date: January 29, 2025\nParties to the Agreement:\n- Provider (Vendor): [Vendor Name] - Client (Payer): [Client Name]\nFees and Payment Terms:\n- Monthly Recurring Fee: \\$20.00 - Payment Schedule: Fees are payable in advance on the 1st day of each month. - First Payment Date: February 1, 2025 - Payment Method: Via credit card to the account designated by Provider. - Payment Due Date: Payment is due 5 days after the invoice date.\n")
        .recurrences(
            new ArrayList<ContractRecurrenceCreateRequest>(
                Arrays.asList(
                    ContractRecurrenceCreateRequest
                        .builder()
                        .rrule("DTSTART:20250201T000000ZRRULE:FREQ=MONTHLY;INTERVAL=1;BYMONTHDAY=1")
                        .justification("Monthly recurring fee billed in advance on the 1st of each month")
                        .filteredContractSummary("Contract Start Date: January 29, 2025\nParties to the Agreement:\n- Provider (Vendor): [Vendor Name] - Client (Payer): [Client Name]\nFees and Payment Terms:\n- Monthly Recurring Fee: \\$20.00 - Payment Schedule: Fees are payable in advance on the 1st day of each month. - First Payment Date: February 1, 2025 - Payment Method: Via credit card to the account designated by Provider. - Payment Due Date: Payment is due 5 days after the invoice date.\n")
                        .invoiceSchema(
                            ContractInvoiceSchema
                                .builder()
                                .lineItems(
                                    new ArrayList<ContractInvoiceLineItemSchema>(
                                        Arrays.asList(
                                            ContractInvoiceLineItemSchema
                                                .builder()
                                                .name("Monthly Subscription Service Fee")
                                                .unitPrice(20)
                                                .currency(CurrencyCode.USD)
                                                .quantity(1)
                                                .build()
                                        )
                                    )
                                )
                                .build()
                        )
                        .build()
                )
            )
        )
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ContractCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.get(contractId) -> ContractResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().get("cnt_3bd62b69-3835-433e-829f-4388a2e46c41");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contractId:** `String` — Contract ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.update(contractId, request) -> ContractResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().update(
    "cnt_3bd62b69-3835-433e-829f-4388a2e46c41",
    ContractUpdateRequest
        .builder()
        .summary("Contract Start Date: January 29, 2025\nParties to the Agreement:\n- Provider (Vendor): [Vendor Name] - Client (Payer): [Client Name]\nFees and Payment Terms:\n- Monthly Recurring Fee: \\$20.00 - Payment Schedule: Fees are payable in advance on the 1st day of each month. - First Payment Date: February 1, 2025 - Payment Method: Via credit card to the account designated by Provider. - Payment Due Date: Payment is due 5 days after the invoice date.\n")
        .recurrences(
            new ArrayList<ContractRecurrenceCreateRequest>(
                Arrays.asList(
                    ContractRecurrenceCreateRequest
                        .builder()
                        .rrule("DTSTART:20250201T000000ZRRULE:FREQ=MONTHLY;INTERVAL=1;BYMONTHDAY=1")
                        .justification("Monthly recurring fee billed in advance on the 1st of each month")
                        .filteredContractSummary("Contract Start Date: January 29, 2025\nParties to the Agreement:\n- Provider (Vendor): [Vendor Name] - Client (Payer): [Client Name]\nFees and Payment Terms:\n- Monthly Recurring Fee: \\$20.00 - Payment Schedule: Fees are payable in advance on the 1st day of each month. - First Payment Date: February 1, 2025 - Payment Method: Via credit card to the account designated by Provider. - Payment Due Date: Payment is due 5 days after the invoice date.\n")
                        .invoiceSchema(
                            ContractInvoiceSchema
                                .builder()
                                .lineItems(
                                    new ArrayList<ContractInvoiceLineItemSchema>(
                                        Arrays.asList(
                                            ContractInvoiceLineItemSchema
                                                .builder()
                                                .name("Monthly Subscription Service Fee")
                                                .unitPrice(20)
                                                .currency(CurrencyCode.USD)
                                                .quantity(1)
                                                .build()
                                        )
                                    )
                                )
                                .build()
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contractId:** `String` — Contract ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ContractUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.contract.delete(contractId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.contract().delete("cnt_3bd62b69-3835-433e-829f-4388a2e46c41");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**contractId:** `String` — Contract ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## EntityGroup
<details><summary><code>client.entityGroup.getAll() -> EntityGroupFindResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all entity groups. If using a JWT, will return all groups the entity is part of. If using an API key, will return all groups for the organization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().getAll(
    EntityGroupFindRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**limit:** `Optional<Integer>` — The maximum number of results to return. Defaults to 1. Max is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.create(request) -> EntityGroupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create an entity group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().create(
    EntityGroupCreateRequest
        .builder()
        .foreignId("your-group-id")
        .name("AcmeConglomerate")
        .emailToName("acmegroup")
        .entityIds(
            new ArrayList<String>(
                Arrays.asList("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `EntityGroupCreateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.get(entityGroupId) -> EntityGroupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get an entity group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().get(
    "entg_a3582b70-fd04-4888-9185-a640ae9048be",
    EntityGroupGetRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**returnEntityMetadata:** `Optional<String>` — Return simple key/value metadata for the specified keys for the entities in the group. For more complex metadata, use the Metadata API.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.update(entityGroupId, request) -> EntityGroupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update an entity group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().update(
    "entg_a3582b70-fd04-4888-9185-a640ae9048be",
    EntityGroupUpdateRequest
        .builder()
        .foreignId("your-group-id")
        .name("AcmeConglomerate")
        .emailToName("acmegroup")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityGroupUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.delete(entityGroupId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete an entity group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().delete("entityGroupId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.getToken(entityGroupId, request) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a JWT token for an entity group with the given options. This token can be used to authenticate to any entity in the entity group in the Mercoa API and iFrame.

<Warning>We recommend using [this endpoint](/api-reference/entity-group/user/get-token). This will enable features such as approvals and comments.</Warning>
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().getToken(
    "entg_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    TokenGenerationOptions
        .builder()
        .expiresIn("1h")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `TokenGenerationOptions` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.addEntities(entityGroupId, request) -> EntityGroupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Add entities to an entity group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().addEntities(
    "entg_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityGroupAddEntitiesRequest
        .builder()
        .entityIds(
            new ArrayList<String>(
                Arrays.asList("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityGroupAddEntitiesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.removeEntities(entityGroupId, request) -> EntityGroupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Remove entities from an entity group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().removeEntities(
    "entg_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityGroupRemoveEntitiesRequest
        .builder()
        .entityIds(
            new ArrayList<String>(
                Arrays.asList("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityGroupRemoveEntitiesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## EntityGroup Counterparty
<details><summary><code>client.entityGroup.counterparty.addPayees(entityGroupId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create association between all entities in the group and a given list of Payees. If a Payee has previously been archived, unarchive the Payee.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().counterparty().addPayees(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityAddPayeesRequest
        .builder()
        .payees(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .customizations(
            new ArrayList<CounterpartyCustomizationRequest>(
                Arrays.asList(
                    CounterpartyCustomizationRequest
                        .builder()
                        .counterpartyId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                        .accounts(
                            new ArrayList<CounterpartyCustomizationAccount>(
                                Arrays.asList(
                                    CounterpartyCustomizationAccount
                                        .builder()
                                        .accountId("85866843")
                                        .postalCode("94105")
                                        .nameOnAccount("John Doe")
                                        .build()
                                )
                            )
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityAddPayeesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.counterparty.hidePayees(entityGroupId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Marks Payees as unsearchable by all entities in the group via Counterparty search. Invoices associated with these Payees will still be searchable via Invoice search.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().counterparty().hidePayees(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityHidePayeesRequest
        .builder()
        .payees(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityHidePayeesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.counterparty.addPayors(entityGroupId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create association between all entities in the group and a given list of Payors. If a Payor has previously been archived, unarchive the Payor.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().counterparty().addPayors(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityAddPayorsRequest
        .builder()
        .payors(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .customizations(
            new ArrayList<CounterpartyCustomizationRequest>(
                Arrays.asList(
                    CounterpartyCustomizationRequest
                        .builder()
                        .counterpartyId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                        .accounts(
                            new ArrayList<CounterpartyCustomizationAccount>(
                                Arrays.asList(
                                    CounterpartyCustomizationAccount
                                        .builder()
                                        .accountId("85866843")
                                        .postalCode("94105")
                                        .nameOnAccount("John Doe")
                                        .build()
                                )
                            )
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityAddPayorsRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.counterparty.hidePayors(entityGroupId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Marks Payors as unsearchable by all entities in the group via Counterparty search. Invoices associated with these Payors will still be searchable via Invoice search.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().counterparty().hidePayors(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityHidePayorsRequest
        .builder()
        .payors(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityHidePayorsRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## EntityGroup User
<details><summary><code>client.entityGroup.user.find(entityGroupId) -> FindEntityGroupUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search entity group users
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().find(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityFindEntityRequest
        .builder()
        .name("John")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `Optional<String>` — ID used to identify user in your system
    
</dd>
</dl>

<dl>
<dd>

**role:** `Optional<String>` — Filter users by role. If multiple roles are provided, users with any of the roles will be returned.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Filter users by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional<String>` — Filter users by email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of entities to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the user to start after. If not provided, the first page of entities will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.user.create(entityGroupId, request) -> EntityGroupUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create entity user that will be added to all entities in the group. If a user with the same foreignId already exists, the user will be updated with the new information.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().create(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityGroupUserRequest
        .builder()
        .foreignId("MY-DB-ID-12345")
        .email("john.doe@acme.com")
        .name("John Doe")
        .entities(
            new ArrayList<EntityGroupUserEntityRequest>(
                Arrays.asList(
                    EntityGroupUserEntityRequest
                        .builder()
                        .roles(
                            new ArrayList<String>(
                                Arrays.asList("admin", "approver")
                            )
                        )
                        .entityId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                        .build(),
                    EntityGroupUserEntityRequest
                        .builder()
                        .roles(
                            new ArrayList<String>(
                                Arrays.asList("viewer")
                            )
                        )
                        .entityId("ent_9e02a20e-7749-47de-8d8a-f8ff2859fa90")
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityGroupUserRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.user.get(entityGroupId, foreignId) -> EntityGroupUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get entity user from a group
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().get("entg_8545a84e-a45f-41bf-bdf1-33b42a55812c", "MY-DB-ID-12345");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `String` — ID used to identify user in your system
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.user.update(entityGroupId, foreignId, request) -> EntityGroupUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update entity user for all entities in the group.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().update(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "MY-DB-ID-12345",
    EntityGroupUserRequest
        .builder()
        .foreignId("MY-DB-ID-12345")
        .email("john.doe@acme.com")
        .name("John Doe")
        .entities(
            new ArrayList<EntityGroupUserEntityRequest>(
                Arrays.asList(
                    EntityGroupUserEntityRequest
                        .builder()
                        .roles(
                            new ArrayList<String>(
                                Arrays.asList("admin", "approver")
                            )
                        )
                        .entityId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                        .build(),
                    EntityGroupUserEntityRequest
                        .builder()
                        .roles(
                            new ArrayList<String>(
                                Arrays.asList("viewer")
                            )
                        )
                        .entityId("ent_9e02a20e-7749-47de-8d8a-f8ff2859fa90")
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `String` — ID used to identify user in your system
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityGroupUserRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.user.delete(entityGroupId, foreignId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete entity user from all entities in the group. This will also remove the user from all approval policies. If an approval policy will break as a result of this operation, this request will fail.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().delete("entityGroupId", "foreignId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `String` — ID used to identify user in your system
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.user.getToken(entityGroupId, foreignId, request) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a JWT token for an entity group with the given options. This token can be used to authenticate to any entity in the entity group as the user in the Mercoa API and iFrame.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().getToken(
    "entg_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    "MY-DB-ID-12345",
    TokenGenerationOptions
        .builder()
        .expiresIn("1h")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `String` — ID used to identify user in your system
    
</dd>
</dl>

<dl>
<dd>

**request:** `TokenGenerationOptions` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.user.sync(entityGroupId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Sync entity group users. This will add users to entities that do not have them and remove users from entities that have them.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().user().sync(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityGroupUserSyncRequest
        .builder()
        .filterRoles(
            new ArrayList<String>(
                Arrays.asList("approver", "viewer")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityGroupUserSyncRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity
<details><summary><code>client.entity.find() -> FindEntityResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search all entities with the given filters. If no filters are provided, all entities will be returned.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().find(
    FindEntities
        .builder()
        .foreignId(
            new ArrayList<Optional<String>>(
                Arrays.asList("MY-DB-ID-12345")
            )
        )
        .isCustomer(true)
        .paymentMethods(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — If true, will include entity payment methods as part of the response
    
</dd>
</dl>

<dl>
<dd>

**isCustomer:** `Optional<Boolean>` — If true, only entities with a direct relationship to the requesting organization will be returned. If false or not provided, all entities will be returned.
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `Optional<String>` — ID used to identify this entity in your system
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<EntityStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**isPayee:** `Optional<Boolean>` 

If true, entities that are marked as payees will be returned.
If false or not provided, entities that are marked as payees will not be returned.
    
</dd>
</dl>

<dl>
<dd>

**isPayor:** `Optional<Boolean>` 

If true or not provided, entities that are marked as payors will be returned.
If false, entities that are marked as payors will not be returned.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Use search instead. Deprecated. Filter entities by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find entities by name, email, or emailTo. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter entities by simple key/value metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — Return simple key/value metadata for the specified keys for the entities. For more complex metadata, use the Metadata API.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of entities to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the entity to start after. If not provided, the first page of entities will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.create(request) -> EntityResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().create(
    EntityRequest.ofEntityCreationRequest(
        EntityCreationRequest
            .builder()
            .isCustomer(true)
            .isPayor(true)
            .isPayee(false)
            .accountType(AccountType.BUSINESS)
            .profile(
                ProfileRequest
                    .builder()
                    .business(
                        BusinessProfileRequest
                            .builder()
                            .legalBusinessName("Acme Inc.")
                            .email("customer@acme.com")
                            .website("http://www.acme.com")
                            .businessType(BusinessType.LLC)
                            .phone(
                                PhoneNumber
                                    .builder()
                                    .countryCode("1")
                                    .number("4155551234")
                                    .build()
                            )
                            .address(
                                Address
                                    .builder()
                                    .addressLine1("123 Main St")
                                    .city("San Francisco")
                                    .stateOrProvince("CA")
                                    .postalCode("94105")
                                    .addressLine2("Unit 1")
                                    .country("US")
                                    .build()
                            )
                            .taxId(
                                TaxId
                                    .builder()
                                    .ein(
                                        Ein
                                            .builder()
                                            .number("12-3456789")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .foreignId("MY-DB-ID-12345")
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `EntityRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.get(entityId) -> EntityResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().get(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityGetRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — Return simple key/value metadata for the specified keys for the entities. For more complex metadata, use the Metadata API.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.update(entityId, request) -> EntityResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().update(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityUpdateRequest
        .builder()
        .isCustomer(true)
        .isPayor(true)
        .isPayee(false)
        .accountType(AccountType.BUSINESS)
        .foreignId("MY-DB-ID-12345")
        .profile(
            ProfileRequest
                .builder()
                .business(
                    BusinessProfileRequest
                        .builder()
                        .legalBusinessName("Acme Inc.")
                        .email("customer@acme.com")
                        .website("http://www.acme.com")
                        .businessType(BusinessType.LLC)
                        .phone(
                            PhoneNumber
                                .builder()
                                .countryCode("1")
                                .number("4155551234")
                                .build()
                        )
                        .address(
                            Address
                                .builder()
                                .addressLine1("123 Main St")
                                .city("San Francisco")
                                .stateOrProvince("CA")
                                .postalCode("94105")
                                .addressLine2("Unit 1")
                                .country("US")
                                .build()
                        )
                        .taxId(
                            TaxId
                                .builder()
                                .ein(
                                    Ein
                                        .builder()
                                        .number("12-3456789")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.delete(entityId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Will archive the entity. This action cannot be undone, and the entity will no longer be available for use. The foreignId on the entity will be cleared as well.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().delete("entityId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.acceptTermsOfService(entityId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint is used to indicate acceptance of Mercoa's terms of service for an entity. Send a request to this endpoint only after the entity has accepted the Mercoa ToS. Entities must accept Mercoa ToS before they can be send or pay invoices using Mercoa's payment rails.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().acceptTermsOfService("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.initiateKyb(entityId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint is used to initiate KYB for an entity. 
Send a request to this endpoint only after the entity has accepted the Mercoa ToS,
all representatives have been added, and all required fields have been filled out.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().initiateKyb("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.processKyb(entityId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().processKyb(
    "entityId",
    ProcessKybRequest
        .builder()
        .reviewerEmail("reviewerEmail")
        .capabilities(
            new ArrayList<MoovCapability>(
                Arrays.asList(MoovCapability.TRANSFERS, MoovCapability.TRANSFERS)
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `ProcessKybRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.getNoOptionToken(entityId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get JWT token for entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().getNoOptionToken("entityId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.getToken(entityId, request) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a JWT token for an entity with the given options. This token can be used to authenticate the entity in the Mercoa API and iFrame.

<Warning>We recommend using [this endpoint](/api-reference/entity/user/get-token). This will enable features such as approvals and comments.</Warning>
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().getToken(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    TokenGenerationOptions
        .builder()
        .expiresIn("1h")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `TokenGenerationOptions` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.getOnboardingLink(entityId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate an onboarding link for the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().getOnboardingLink(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    GenerateOnboardingLink
        .builder()
        .type(EntityOnboardingLinkType.PAYOR)
        .expiresIn("1h")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**type:** `EntityOnboardingLinkType` — The type of onboarding link to generate. If not provided, the default is payee. The onboarding options are determined by your organization's onboarding configuration.
    
</dd>
</dl>

<dl>
<dd>

**expiresIn:** `Optional<String>` — Expressed in seconds or a string describing a time span. The default is 24h.
    
</dd>
</dl>

<dl>
<dd>

**connectedEntityId:** `Optional<String>` — The ID of the entity to connect to. If onboarding a payee, this should be the payor entity ID. If onboarding a payor, this should be the payee entity ID. If no connected entity ID is provided, the onboarding link will be for a standalone entity.
    
</dd>
</dl>

<dl>
<dd>

**redirectToPortal:** `Optional<Boolean>` — If true, the onboarding link will redirect to the vendor/customer portal if the entity is already onboarded. If false, the onboarding link will not redirect to the portal. The default is false.
    
</dd>
</dl>

<dl>
<dd>

**vendorPortalOptions:** `Optional<VendorPortalOptions>` — The options for the vendor portal.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.sendOnboardingLink(entityId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Send an email with a onboarding link to the entity. The email will be sent to the email address associated with the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().sendOnboardingLink(
    "entityId",
    SendOnboardingLink
        .builder()
        .type(EntityOnboardingLinkType.PAYEE)
        .expiresIn("expiresIn")
        .connectedEntityId("connectedEntityId")
        .redirectToPortal(true)
        .vendorPortalOptions(
            VendorPortalOptions
                .builder()
                .tabs(
                    new ArrayList<VendorPortalTab>(
                        Arrays.asList(VendorPortalTab.HOME, VendorPortalTab.HOME)
                    )
                )
                .defaultTab(VendorPortalTab.HOME)
                .welcomeMessage("welcomeMessage")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**type:** `EntityOnboardingLinkType` — The type of onboarding link to generate. If not provided, the default is payee. The onboarding options are determined by your organization's onboarding configuration.
    
</dd>
</dl>

<dl>
<dd>

**expiresIn:** `Optional<String>` — Expressed in seconds or a string describing a time span. The default is 7 days.
    
</dd>
</dl>

<dl>
<dd>

**connectedEntityId:** `Optional<String>` — The ID of the entity to connect to. If onboarding a payee, this should be the payor entity ID. If onboarding a payor, this should be the payee entity ID. If no connected entity ID is provided, the onboarding link will be for a standalone entity.
    
</dd>
</dl>

<dl>
<dd>

**redirectToPortal:** `Optional<Boolean>` — If true, the onboarding link will redirect to the vendor/customer portal if the entity is already onboarded. If false, the onboarding link will not redirect to the portal. The default is false.
    
</dd>
</dl>

<dl>
<dd>

**vendorPortalOptions:** `Optional<VendorPortalOptions>` — The options for the vendor portal.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.events(entityId) -> EntityEventsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all events for an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().events(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityEntityGetEventsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. If not provided, events from the start of time will be returned.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. If not provided, events to the end of time will be returned.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of events to return. Limit can range between 1 and 100, and the default is 50.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the event to start after. If not provided, the first page of events will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Counterparty
<details><summary><code>client.entity.counterparty.findPayees(entityId) -> FindCounterpartiesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Find payee counterparties. This endpoint lets you find vendors linked to the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().findPayees(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    FindPayeeCounterpartiesRequest
        .builder()
        .name("Big Box")
        .paymentMethods(true)
        .invoiceMetrics(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Use search instead. Deprecated. Filter counterparties by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Filter counterparties by name or email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**networkType:** `Optional<CounterpartyNetworkType>` — Filter by network type. By default, only ENTITY counterparties are returned.
    
</dd>
</dl>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — If true, will include counterparty payment methods as part of the response
    
</dd>
</dl>

<dl>
<dd>

**invoiceMetrics:** `Optional<Boolean>` — If true, will include counterparty invoice metrics as part of the response
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `Optional<String>` — Filter by counterparty ids (Foreign ID is supported)
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter counterparties by simple key/value metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — If true, will return simple key/value metadata for the counterparties. For more complex metadata, use the Metadata API.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of counterparties to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the counterparties to start after. If not provided, the first page of counterparties will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.findPayors(entityId) -> FindCounterpartiesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Find payor counterparties. This endpoint lets you find customers linked to the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().findPayors(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    FindPayorCounterpartiesRequest
        .builder()
        .name("Big Box")
        .paymentMethods(true)
        .invoiceMetrics(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Use search instead. Deprecated. Filter counterparties by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Filter counterparties by name or email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**networkType:** `Optional<CounterpartyNetworkType>` — Filter by network type. By default, only ENTITY counterparties are returned.
    
</dd>
</dl>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — If true, will include counterparty payment methods as part of the response
    
</dd>
</dl>

<dl>
<dd>

**invoiceMetrics:** `Optional<Boolean>` — If true, will include counterparty invoice metrics as part of the response
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `Optional<String>` — Filter by counterparty ids (Foreign ID is supported)
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter counterparties by simple key/value metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — If true, will return simple key/value metadata for the counterparties. For more complex metadata, use the Metadata API.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of counterparties to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the counterparties to start after. If not provided, the first page of counterparties will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.addPayees(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create association between Entity and a given list of Payees. If a Payee has previously been archived, unarchive the Payee.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().addPayees(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityAddPayeesRequest
        .builder()
        .payees(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .customizations(
            new ArrayList<CounterpartyCustomizationRequest>(
                Arrays.asList(
                    CounterpartyCustomizationRequest
                        .builder()
                        .counterpartyId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                        .accounts(
                            new ArrayList<CounterpartyCustomizationAccount>(
                                Arrays.asList(
                                    CounterpartyCustomizationAccount
                                        .builder()
                                        .accountId("85866843")
                                        .postalCode("94105")
                                        .nameOnAccount("John Doe")
                                        .build()
                                )
                            )
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityAddPayeesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.hidePayees(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Marks Payees as unsearchable by Entity via Counterparty search. Invoices associated with these Payees will still be searchable via Invoice search.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().hidePayees(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityHidePayeesRequest
        .builder()
        .payees(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityHidePayeesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.archivePayees(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Backwards compatibility for old API clients. Use hidePayees instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().archivePayees(
    "entityId",
    EntityHidePayeesRequest
        .builder()
        .payees(
            new ArrayList<String>(
                Arrays.asList("payees", "payees")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityHidePayeesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.addPayors(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create association between Entity and a given list of Payors. If a Payor has previously been archived, unarchive the Payor.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().addPayors(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityAddPayorsRequest
        .builder()
        .payors(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .customizations(
            new ArrayList<CounterpartyCustomizationRequest>(
                Arrays.asList(
                    CounterpartyCustomizationRequest
                        .builder()
                        .counterpartyId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                        .accounts(
                            new ArrayList<CounterpartyCustomizationAccount>(
                                Arrays.asList(
                                    CounterpartyCustomizationAccount
                                        .builder()
                                        .accountId("85866843")
                                        .postalCode("94105")
                                        .nameOnAccount("John Doe")
                                        .build()
                                )
                            )
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityAddPayorsRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.hidePayors(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Marks Payors as unsearchable by Entity via Counterparty search. Invoices associated with these Payors will still be searchable via Invoice search.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().hidePayors(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityHidePayorsRequest
        .builder()
        .payors(
            new ArrayList<String>(
                Arrays.asList("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityHidePayorsRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.archivePayors(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Backwards compatibility for old API clients. Use hidePayors instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().archivePayors(
    "entityId",
    EntityHidePayorsRequest
        .builder()
        .payors(
            new ArrayList<String>(
                Arrays.asList("payors", "payors")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityHidePayorsRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity EmailLog
<details><summary><code>client.entity.emailLog.find(entityId) -> EmailLogResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all incoming invoice emails for an entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailLog().find(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityEmailLogRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of logs to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the log to start after. If not provided, the first page of logs will be returned.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Search for logs by email address or subject
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.emailLog.get(entityId, logId) -> EmailLog</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get an email log by ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailLog().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "log_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**logId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity PaymentMethod
<details><summary><code>client.entity.paymentMethod.getAll(entityId) -> List&lt;PaymentMethodResponse&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().getAll(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    GetAllPaymentMethodsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<PaymentMethodType>` — Type of payment method to filter
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.create(entityId, request) -> PaymentMethodResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().create(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    PaymentMethodRequest.bankAccount(
        BankAccountRequest
            .builder()
            .routingNumber("12345678")
            .accountNumber("99988767623")
            .accountType(BankType.CHECKING)
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `PaymentMethodRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.get(entityId, paymentMethodId) -> PaymentMethodResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "pm_4794d597-70dc-4fec-b6ec-c5988e759769");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.update(entityId, paymentMethodId, request) -> PaymentMethodResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Only custom payment methods can be updated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().update(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    PaymentMethodUpdateRequest.bankAccount(
        BankAccountUpdateRequest
            .builder()
            .defaultSource(true)
            .defaultDestination(true)
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `PaymentMethodUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.delete(entityId, paymentMethodId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Mark a payment method as inactive. This will not remove the payment method from the system, but will prevent it from being used in the future.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().delete("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "pm_4794d597-70dc-4fec-b6ec-c5988e759769");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.plaidLinkToken(entityId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a Plaid link token for an entity. This token can be used to add or update a bank account to the entity using Plaid Link.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().plaidLinkToken(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    PlaidLinkTokenRequest
        .builder()
        .paymentMethodId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `Optional<String>` — ID of Bank Account to update
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.cardLinkToken(entityId) -> CardLinkTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a card link token for an entity. This token is used by the frontend components to generate a PCI compliant form to add a card to the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().cardLinkToken("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.events(entityId, paymentMethodId) -> PaymentMethodEventsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().events(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    PaymentMethodEventsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. If not provided, events from the start of time will be returned.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. If not provided, events to the end of time will be returned.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of events returned. Limit can range between 1 and 100, and the default is 50.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the event to start after.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity User
<details><summary><code>client.entity.user.find(entityId) -> FindEntityUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search entity users
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().find(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityFindEntityRequest
        .builder()
        .name("John")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `Optional<String>` — ID used to identify user in your system
    
</dd>
</dl>

<dl>
<dd>

**role:** `Optional<String>` — Filter users by role. If multiple roles are provided, users with any of the roles will be returned.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Filter users by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional<String>` — Filter users by email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of entities to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the user to start after. If not provided, the first page of entities will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.findOld(entityId) -> FindEntityUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search entity users
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().findOld(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityFindOldEntityRequest
        .builder()
        .name("John")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `Optional<String>` — ID used to identify user in your system
    
</dd>
</dl>

<dl>
<dd>

**role:** `Optional<String>` — Filter users by role. If multiple roles are provided, users with any of the roles will be returned.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Filter users by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional<String>` — Filter users by email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of entities to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the user to start after. If not provided, the first page of entities will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.create(entityId, request) -> EntityUserResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().create(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EntityUserRequest
        .builder()
        .foreignId("MY-DB-ID-12345")
        .email("john.doe@acme.com")
        .name("John Doe")
        .roles(
            new ArrayList<String>(
                Arrays.asList("admin", "approver")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityUserRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.get(entityId, userId) -> EntityUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get entity user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().get("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced", "user_ec3aafc8-ea86-408a-a6c1-545497badbbb");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.update(entityId, userId, request) -> EntityUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update entity user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().update(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    "user_ec3aafc8-ea86-408a-a6c1-545497badbbb",
    EntityUserRequest
        .builder()
        .foreignId("MY-DB-ID-12345")
        .email("john.doe@acme.com")
        .name("John Doe")
        .roles(
            new ArrayList<String>(
                Arrays.asList("admin", "approver")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EntityUserRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.delete(entityId, userId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete entity user. This will also remove the user from all approval policies. If an approval policy will break as a result of this operation, this request will fail.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().delete("entityId", "userId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.getNoOptionToken(entityId, userId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get JWT token for entity user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().getNoOptionToken("entityId", "userId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.getToken(entityId, userId, request) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a JWT token for an entity user with the given options. This token can be used to authenticate the entity and entity user in the Mercoa API and iFrame.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().getToken(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    "user_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    TokenGenerationOptions
        .builder()
        .expiresIn("1h")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `TokenGenerationOptions` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## InvoiceTemplate
<details><summary><code>client.invoiceTemplate.find() -> FindInvoiceTemplateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search invoice templates for all entities in the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().find(
    GetAllInvoiceTemplatesRequest
        .builder()
        .entityId(
            new ArrayList<Optional<String>>(
                Arrays.asList("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `Optional<String>` — Filter invoice templates by the ID or foreign ID of the entity that is the payer or the vendor of the invoice template.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoice templates by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoice templates by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of invoice templates to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the invoice template to start after. If not provided, the first page of invoice templates will be returned.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoice templates by vendor name, check number, invoice number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoice templates by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter invoice templates by line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter invoice templates by line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoice templates by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoice templates by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoice templates by assigned approver user ID.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoice templates by approver action. Needs to be used with approverId. For example, if you want to find all invoice templates that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoice templates by invoice ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoice templates by recurring status
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.create(request) -> InvoiceTemplateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().create(
    InvoiceTemplateCreationRequest
        .builder()
        .status(InvoiceStatus.NEW)
        .amount(100)
        .currency(CurrencyCode.USD)
        .invoiceDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        .dueDate(OffsetDateTime.parse("2021-01-13T00:00:00Z"))
        .deductionDate(OffsetDateTime.parse("2021-01-10T00:00:00Z"))
        .paymentSchedule(
            PaymentSchedule.monthly(
                PaymentMonthSchedule
                    .builder()
                    .repeatOnDay(10)
                    .ends(
                        PaymentScheduleEndCondition.of()
                    )
                    .build()
            )
        )
        .invoiceNumber("INV-123")
        .noteToSelf("Monthly recurring payment")
        .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
        .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
        .paymentDestinationId("pm_5fde2f4a-facc-48ef-8f0d-6b7d087c7b18")
        .paymentDestinationOptions(
            PaymentDestinationOptions.check(
                CheckPaymentDestinationOptions
                    .builder()
                    .delivery(CheckDeliveryMethod.MAIL)
                    .printDescription(true)
                    .build()
            )
        )
        .lineItems(
            new ArrayList<InvoiceLineItemCreationRequest>(
                Arrays.asList(
                    InvoiceLineItemCreationRequest
                        .builder()
                        .amount(100)
                        .currency(CurrencyCode.USD)
                        .description("Product A")
                        .name("Product A")
                        .quantity(1)
                        .unitPrice(100)
                        .category("EXPENSE")
                        .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                        .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
                        .metadata(
                            new HashMap<String, String>() {{
                                put("key1", "value1");
                                put("key2", "value2");
                            }}
                        )
                        .glAccountId("600394")
                        .build()
                )
            )
        )
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .creatorUserId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `InvoiceTemplateCreationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.get(invoiceTemplateId) -> InvoiceTemplateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().get("invt_13c07096-5848-4aeb-ae7d-6576289034c4");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.update(invoiceTemplateId, request) -> InvoiceTemplateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().update(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    InvoiceTemplateUpdateRequest
        .builder()
        .status(InvoiceStatus.NEW)
        .amount(100)
        .currency(CurrencyCode.USD)
        .invoiceDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        .dueDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
        .invoiceNumber("INV-123")
        .noteToSelf("For the month of January")
        .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
        .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
        .paymentDestinationId("pm_5fde2f4a-facc-48ef-8f0d-6b7d087c7b18")
        .paymentDestinationOptions(
            PaymentDestinationOptions.check(
                CheckPaymentDestinationOptions
                    .builder()
                    .delivery(CheckDeliveryMethod.MAIL)
                    .printDescription(true)
                    .build()
            )
        )
        .lineItems(
            new ArrayList<InvoiceLineItemUpdateRequest>(
                Arrays.asList(
                    InvoiceLineItemUpdateRequest
                        .builder()
                        .id("inli_26672f38-eb9a-48f1-a7a0-f1b855e38cd7")
                        .amount(100)
                        .currency(CurrencyCode.USD)
                        .description("Product A")
                        .name("Product A")
                        .quantity(1)
                        .unitPrice(100)
                        .category("EXPENSE")
                        .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                        .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
                        .metadata(
                            new HashMap<String, String>() {{
                                put("key1", "value1");
                                put("key2", "value2");
                            }}
                        )
                        .glAccountId("600394")
                        .build()
                )
            )
        )
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .creatorUserId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `InvoiceTemplateUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.delete(invoiceTemplateId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Only invoice templates in the UNASSIGNED and DRAFT statuses can be deleted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().delete("invt_13c07096-5848-4aeb-ae7d-6576289034c4");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## InvoiceTemplate LineItem
<details><summary><code>client.invoiceTemplate.lineItem.update(invoiceTemplateId, lineItemId, request) -> InvoiceTemplateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update invoice template line item
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().lineItem().update(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    "inli_8aa84cb8-2ae7-4579-8fa3-87586e7c14a7",
    InvoiceLineItemIndividualUpdateRequest
        .builder()
        .name("Product A")
        .description("Product A")
        .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
        .metadata(
            new HashMap<String, String>() {{
                put("key1", "value1");
                put("key2", "value2");
            }}
        )
        .glAccountId("600394")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**lineItemId:** `String` — Invoice Line Item ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `InvoiceLineItemIndividualUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice
<details><summary><code>client.invoice.find() -> FindInvoiceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search invoices for all entities in the organization
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().find(
    GetAllInvoicesRequest
        .builder()
        .entityId(
            new ArrayList<Optional<String>>(
                Arrays.asList("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the entity that is the payer or the vendor of the invoice.
    
</dd>
</dl>

<dl>
<dd>

**entityGroupId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the entity group that the entity belongs to.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoices by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoices by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of invoices to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the invoice to start after. If not provided, the first page of invoices will be returned.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter invoices by line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter invoices by line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID. Only invoices with all upstream policies approved will be returned.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**approverCount:** `Optional<String>` — Filter invoices by the number of approvers. Use exact number (e.g., 3) or range (e.g., ">3", "<5", ">=2", "<=4").
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoices by recurring status
    
</dd>
</dl>

<dl>
<dd>

**invoiceTemplateId:** `Optional<String>` — Filter invoice by invoice template ID
    
</dd>
</dl>

<dl>
<dd>

**returnPayerMetadata:** `Optional<Boolean>` — Whether to return payer metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnVendorMetadata:** `Optional<Boolean>` — Whether to return vendor metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnPaymentTiming:** `Optional<Boolean>` — Whether to return payment timing in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.create(request) -> InvoiceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().create(
    InvoiceCreationRequest.ofInvoiceCreationWithEntityRequest(
        InvoiceCreationWithEntityRequest
            .builder()
            .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
            .status(InvoiceStatus.NEW)
            .amount(100)
            .currency(CurrencyCode.USD)
            .invoiceDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
            .dueDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
            .invoiceNumber("INV-123")
            .noteToSelf("For the month of January")
            .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
            .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
            .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
            .paymentDestinationId("pm_5fde2f4a-facc-48ef-8f0d-6b7d087c7b18")
            .paymentDestinationOptions(
                PaymentDestinationOptions.check(
                    CheckPaymentDestinationOptions
                        .builder()
                        .delivery(CheckDeliveryMethod.MAIL)
                        .printDescription(true)
                        .build()
                )
            )
            .lineItems(
                new ArrayList<InvoiceLineItemCreationRequest>(
                    Arrays.asList(
                        InvoiceLineItemCreationRequest
                            .builder()
                            .amount(100)
                            .currency(CurrencyCode.USD)
                            .description("Product A")
                            .name("Product A")
                            .quantity(1)
                            .unitPrice(100)
                            .category("EXPENSE")
                            .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                            .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
                            .metadata(
                                new HashMap<String, String>() {{
                                    put("key1", "value1");
                                    put("key2", "value2");
                                }}
                            )
                            .glAccountId("600394")
                            .build()
                    )
                )
            )
            .creatorUserId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `InvoiceCreationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.get(invoiceId) -> InvoiceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().get("in_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.update(invoiceId, request) -> InvoiceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().update(
    "in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9",
    InvoiceUpdateRequest
        .builder()
        .status(InvoiceStatus.NEW)
        .amount(100)
        .currency(CurrencyCode.USD)
        .invoiceDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        .dueDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
        .invoiceNumber("INV-123")
        .noteToSelf("For the month of January")
        .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
        .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
        .paymentDestinationId("pm_5fde2f4a-facc-48ef-8f0d-6b7d087c7b18")
        .paymentDestinationOptions(
            PaymentDestinationOptions.check(
                CheckPaymentDestinationOptions
                    .builder()
                    .delivery(CheckDeliveryMethod.MAIL)
                    .printDescription(true)
                    .build()
            )
        )
        .lineItems(
            new ArrayList<InvoiceLineItemUpdateRequest>(
                Arrays.asList(
                    InvoiceLineItemUpdateRequest
                        .builder()
                        .id("inli_26672f38-eb9a-48f1-a7a0-f1b855e38cd7")
                        .amount(100)
                        .currency(CurrencyCode.USD)
                        .description("Product A")
                        .name("Product A")
                        .quantity(1)
                        .unitPrice(100)
                        .category("EXPENSE")
                        .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                        .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
                        .metadata(
                            new HashMap<String, String>() {{
                                put("key1", "value1");
                                put("key2", "value2");
                            }}
                        )
                        .glAccountId("600394")
                        .build()
                )
            )
        )
        .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
        .creatorUserId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `InvoiceUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.delete(invoiceId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Only invoices in the UNASSIGNED and DRAFT statuses can be deleted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().delete("in_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.events(invoiceId) -> InvoiceEventsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all events for an invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().events(
    "in_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    InvoiceInvoiceGetEventsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. If not provided, events from the start of time will be returned.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. If not provided, events to the end of time will be returned.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of events to return. Limit can range between 1 and 100, and the default is 50.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the event to start after. If not provided, the first page of events will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice LineItem
<details><summary><code>client.invoice.lineItem.update(invoiceId, lineItemId, request) -> InvoiceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update invoice line item
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().lineItem().update(
    "in_d8f68285-1c6d-4d5a-a9e3-252c3180fac4",
    "inli_8aa84cb8-2ae7-4579-8fa3-87586e7c14a7",
    InvoiceLineItemIndividualUpdateRequest
        .builder()
        .name("Product A")
        .description("Product A")
        .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
        .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
        .metadata(
            new HashMap<String, String>() {{
                put("key1", "value1");
                put("key2", "value2");
            }}
        )
        .glAccountId("600394")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID
    
</dd>
</dl>

<dl>
<dd>

**lineItemId:** `String` — Invoice Line Item ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `InvoiceLineItemIndividualUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Organization
<details><summary><code>client.organization.get() -> OrganizationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get current organization information
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().get(
    GetOrganizationRequest
        .builder()
        .paymentMethods(true)
        .emailProvider(true)
        .externalAccountingSystemProvider(true)
        .colorScheme(true)
        .payeeOnboardingOptions(true)
        .payorOnboardingOptions(true)
        .metadataSchema(true)
        .notificationEmailTemplate(true)
        .rolePermissions(true)
        .customDomains(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — include supported payment methods in response
    
</dd>
</dl>

<dl>
<dd>

**emailProvider:** `Optional<Boolean>` — include email provider info in response
    
</dd>
</dl>

<dl>
<dd>

**externalAccountingSystemProvider:** `Optional<Boolean>` — include external accounting system provider info in response
    
</dd>
</dl>

<dl>
<dd>

**colorScheme:** `Optional<Boolean>` — include color scheme info in response
    
</dd>
</dl>

<dl>
<dd>

**payeeOnboardingOptions:** `Optional<Boolean>` — include payee onboarding options in response
    
</dd>
</dl>

<dl>
<dd>

**payorOnboardingOptions:** `Optional<Boolean>` — include payor onboarding options in response
    
</dd>
</dl>

<dl>
<dd>

**metadataSchema:** `Optional<Boolean>` — include metadata schema in response
    
</dd>
</dl>

<dl>
<dd>

**notificationEmailTemplate:** `Optional<Boolean>` — include notification-email-template in response
    
</dd>
</dl>

<dl>
<dd>

**rolePermissions:** `Optional<Boolean>` — include role permission config in response
    
</dd>
</dl>

<dl>
<dd>

**customDomains:** `Optional<Boolean>` — include custom domains in response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organization.emailLog() -> EmailLogResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get log of all emails sent to this organization. Content format subject to change.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().emailLog(
    GetEmailLogRequest
        .builder()
        .startDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .endDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .from("from")
        .to("to")
        .limit(1)
        .startingAfter("startingAfter")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**from:** `Optional<String>` — Filter by sender email address
    
</dd>
</dl>

<dl>
<dd>

**to:** `Optional<String>` — Filter by recipient email address
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of logs to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the log to start after. If not provided, the first page of logs will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organization.invalidateTokens(request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Invalidate all JWT tokens for the current organization. This is considered a break-glass action and should be used only if tokens have been compromised. All tokens will be invalidated, including tokens on links, emails, and currently logged in sessions. API keys are not affected by this action. This action may take 60 seconds to propagate.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().invalidateTokens(
    InvalidateTokensRequest
        .builder()
        .sessionId(
            new ArrayList<String>(
                Arrays.asList("session_123", "session_456")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sessionId:** `Optional<List<String>>` — Optional list of session IDs to invalidate. If not provided, all sessions will be invalidated.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Surgery
<details><summary><code>client.surgery.getInvoiceSurgery(invoiceId) -> InvoiceSurgeryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get invoice surgery
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().getInvoiceSurgery("invoiceId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.surgery.updateInvoiceSurgery(invoiceId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update invoice surgery
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().updateInvoiceSurgery(
    "invoiceId",
    InvoiceSurgeryRequest
        .builder()
        .actorEmail("actorEmail")
        .foreignId("foreignId")
        .status(InvoiceStatus.UNASSIGNED)
        .amount(1.1)
        .currency(CurrencyCode.AED)
        .invoiceDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .dueDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .deductionDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .settlementDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .invoiceNumber("invoiceNumber")
        .noteToSelf("noteToSelf")
        .paymentSchedule(
            PaymentSchedule.oneTime(
                PaymentScheduleBase
                    .builder()
                    .repeatEvery(1)
                    .ends(
                        PaymentScheduleEndCondition.of(1)
                    )
                    .build()
            )
        )
        .serviceStartDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .serviceEndDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .payerId("payerId")
        .vendorId("vendorId")
        .paymentSourceId("paymentSourceId")
        .paymentDestinationId("paymentDestinationId")
        .paymentDestinationConfirmed(true)
        .paymentDestinationOptions(
            PaymentDestinationOptions.check(
                CheckPaymentDestinationOptions
                    .builder()
                    .delivery(CheckDeliveryMethod.PRINT)
                    .printDescription(true)
                    .build()
            )
        )
        .approvalPolicy("approvalPolicy")
        .approvers(
            new ArrayList<ApprovalSlotAssignmentWithAction>(
                Arrays.asList(
                    ApprovalSlotAssignmentWithAction
                        .builder()
                        .action(ApproverAction.NONE)
                        .approvalSlotId("approvalSlotId")
                        .assignedUserId("assignedUserId")
                        .build(),
                    ApprovalSlotAssignmentWithAction
                        .builder()
                        .action(ApproverAction.NONE)
                        .approvalSlotId("approvalSlotId")
                        .assignedUserId("assignedUserId")
                        .build()
                )
            )
        )
        .resetApprovalPolicy(true)
        .lineItems(
            new ArrayList<InvoiceLineItemUpdateRequest>(
                Arrays.asList(
                    InvoiceLineItemUpdateRequest
                        .builder()
                        .id("id")
                        .amount(1.1)
                        .description("description")
                        .currency(CurrencyCode.AED)
                        .name("name")
                        .quantity(1.1)
                        .unitPrice(1.1)
                        .category("category")
                        .serviceStartDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                        .serviceEndDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                        .metadata(
                            new HashMap<String, String>() {{
                                put("metadata", "metadata");
                            }}
                        )
                        .glAccountId("glAccountId")
                        .build(),
                    InvoiceLineItemUpdateRequest
                        .builder()
                        .id("id")
                        .amount(1.1)
                        .description("description")
                        .currency(CurrencyCode.AED)
                        .name("name")
                        .quantity(1.1)
                        .unitPrice(1.1)
                        .category("category")
                        .serviceStartDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                        .serviceEndDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                        .metadata(
                            new HashMap<String, String>() {{
                                put("metadata", "metadata");
                            }}
                        )
                        .glAccountId("glAccountId")
                        .build()
                )
            )
        )
        .metadata(
            new HashMap<String, String>() {{
                put("metadata", "metadata");
            }}
        )
        .sourcePaymentMethodFee(1.1)
        .sourcePlatformMarkupFee(1.1)
        .destinationPaymentMethodFee(1.1)
        .destinationPlatformMarkupFee(1.1)
        .uploadedImage("uploadedImage")
        .creatorEntityId("creatorEntityId")
        .creatorUserId("creatorUserId")
        .batchPayment(true)
        .failureType(InvoiceFailureType.SOURCE_PAYMENT_ERROR)
        .deleted(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `InvoiceSurgeryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.surgery.updateTransactionSurgery(transactionId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update transaction surgery
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().updateTransactionSurgery(
    "transactionId",
    TransactionSurgeryRequest
        .builder()
        .type(TransactionType.BANK_ACCOUNT_TO_BANK_ACCOUNT)
        .status(TransactionStatus.CREATED)
        .failureReason(
            TransactionFailureReason
                .builder()
                .code("code")
                .description("description")
                .build()
        )
        .checkNumber(1)
        .payerId("payerId")
        .vendorId("vendorId")
        .paymentSourceId("paymentSourceId")
        .paymentDestinationId("paymentDestinationId")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**transactionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `TransactionSurgeryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.surgery.getBankSurgery(bankId) -> BankAccountResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get bank surgery
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().getBankSurgery("bankId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**bankId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.surgery.updateBankSurgery(bankId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update bank surgery
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().updateBankSurgery(
    "bankId",
    BankAccountSurgeryRequest
        .builder()
        .moovId("moovId")
        .routingNumber("routingNumber")
        .accountNumber("accountNumber")
        .accountType(BankType.CHECKING)
        .accountName("accountName")
        .bankName("bankName")
        .plaid(
            PlaidLinkRequest.ofPlaidProcessorTokenRequest(
                PlaidProcessorTokenRequest
                    .builder()
                    .processorToken("processorToken")
                    .build()
            )
        )
        .checkOptions(
            BankAccountCheckOptions
                .builder()
                .signatoryName("signatoryName")
                .enabled(true)
                .initialCheckNumber(1)
                .routingNumberOverride("routingNumberOverride")
                .accountNumberOverride("accountNumberOverride")
                .signatureImage("signatureImage")
                .useSignatureImage(true)
                .build()
        )
        .defaultSource(true)
        .defaultDestination(true)
        .externalAccountingSystemId("externalAccountingSystemId")
        .frozen(true)
        .metadata(
            new HashMap<String, String>() {{
                put("metadata", "metadata");
            }}
        )
        .confirmedByEntity(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**bankId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `BankAccountSurgeryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.surgery.getCheckSurgery(checkId) -> CheckResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get check surgery
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().getCheckSurgery("checkId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**checkId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.surgery.updateCheckStatus(checkId) -> CheckResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update check status
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.surgery().updateCheckStatus("checkId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**checkId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## BankLookup
<details><summary><code>client.bankLookup.find() -> BankLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Find bank account details
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bankLookup().find(
    BankLookupRequest
        .builder()
        .routingNumber("026009593")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**routingNumber:** `String` — Routing number to validate
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Calculate
<details><summary><code>client.calculate.fee(request) -> InvoiceFeesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Calculate the estimated fees associated with an payment given the amount, payment source, and disbursement method. Can be used to calculate fees for a payment before creating an invoice.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.calculate().fee(
    CalculateFeesRequest
        .builder()
        .amount(100)
        .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
        .paymentDestinationId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CalculateFeesRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.calculate.paymentTiming(request) -> CalculatePaymentTimingResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Calculate the estimated payment timing given the deduction date, payment source, and disbursement method. Can be used to calculate timing for a payment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.calculate().paymentTiming(
    CalculatePaymentTimingRequest.ofEstimatedTiming(
        EstimatedTiming
            .builder()
            .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
            .paymentDestinationId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
            .estimatedDeductionDate(OffsetDateTime.parse("2024-01-02T00:00:00Z"))
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CalculatePaymentTimingRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## CustomPaymentMethodSchema
<details><summary><code>client.customPaymentMethodSchema.getAll() -> List&lt;CustomPaymentMethodSchemaResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all custom payment method schemas
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customPaymentMethodSchema().getAll();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customPaymentMethodSchema.create(request) -> CustomPaymentMethodSchemaResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create custom payment method schema
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customPaymentMethodSchema().create(
    CustomPaymentMethodSchemaRequest
        .builder()
        .name("Wire")
        .isSource(false)
        .isDestination(true)
        .fields(
            new ArrayList<CustomPaymentMethodSchemaField>(
                Arrays.asList(
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("bankName")
                        .type(CustomPaymentMethodSchemaFieldType.TEXT)
                        .optional(false)
                        .displayName("Bank Name")
                        .build(),
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("recipientName")
                        .type(CustomPaymentMethodSchemaFieldType.TEXT)
                        .optional(false)
                        .displayName("Recipient Name")
                        .build(),
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("accountNumber")
                        .type(CustomPaymentMethodSchemaFieldType.US_BANK_ACCOUNT_NUMBER)
                        .optional(false)
                        .displayName("Account Number")
                        .useAsAccountNumber(true)
                        .build(),
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("routingNumber")
                        .type(CustomPaymentMethodSchemaFieldType.US_BANK_ROUTING_NUMBER)
                        .optional(false)
                        .displayName("Routing Number")
                        .build()
                )
            )
        )
        .supportedCurrencies(
            new ArrayList<CurrencyCode>(
                Arrays.asList(CurrencyCode.USD, CurrencyCode.EUR)
            )
        )
        .estimatedProcessingTime(0)
        .maxAmount(100000)
        .minAmount(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CustomPaymentMethodSchemaRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customPaymentMethodSchema.update(schemaId, request) -> CustomPaymentMethodSchemaResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update custom payment method schema
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customPaymentMethodSchema().update(
    "cpms_14f78dcd-4614-426e-a37a-7af262431d41",
    CustomPaymentMethodSchemaRequest
        .builder()
        .name("Check")
        .isSource(false)
        .isDestination(true)
        .fields(
            new ArrayList<CustomPaymentMethodSchemaField>(
                Arrays.asList(
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("payToTheOrderOf")
                        .type(CustomPaymentMethodSchemaFieldType.TEXT)
                        .optional(false)
                        .displayName("Pay To The Order Of")
                        .build(),
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("accountNumber")
                        .type(CustomPaymentMethodSchemaFieldType.US_BANK_ACCOUNT_NUMBER)
                        .optional(false)
                        .displayName("Account Number")
                        .useAsAccountNumber(true)
                        .build(),
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("routingNumber")
                        .type(CustomPaymentMethodSchemaFieldType.US_BANK_ROUTING_NUMBER)
                        .optional(false)
                        .displayName("Routing Number")
                        .build(),
                    CustomPaymentMethodSchemaField
                        .builder()
                        .name("address")
                        .type(CustomPaymentMethodSchemaFieldType.ADDRESS)
                        .optional(false)
                        .displayName("Address")
                        .build()
                )
            )
        )
        .supportedCurrencies(
            new ArrayList<CurrencyCode>(
                Arrays.asList(CurrencyCode.USD)
            )
        )
        .estimatedProcessingTime(7)
        .maxAmount(50000)
        .minAmount(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**schemaId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `CustomPaymentMethodSchemaRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customPaymentMethodSchema.get(schemaId) -> CustomPaymentMethodSchemaResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get custom payment method schema
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customPaymentMethodSchema().get("cpms_14f78dcd-4614-426e-a37a-7af262431d41");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**schemaId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.customPaymentMethodSchema.delete(schemaId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete custom payment method schema. Schema that have been used in an invoice cannot be deleted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.customPaymentMethodSchema().delete("cpms_14f78dcd-4614-426e-a37a-7af262431d41");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**schemaId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## EntityGroup Invoice
<details><summary><code>client.entityGroup.invoice.find(entityGroupId) -> FindInvoiceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get invoices for an entity group with the given filters.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().invoice().find(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityGetInvoicesRequest
        .builder()
        .excludeReceivables(true)
        .orderBy(InvoiceOrderByField.CREATED_AT)
        .orderDirection(OrderDirection.ASC)
        .limit(10)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**excludePayables:** `Optional<Boolean>` — Return only invoices that are receivable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**excludeReceivables:** `Optional<Boolean>` — Return only invoices that are payable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date for invoice created on date filter.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date for invoice created date filter.
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoices by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoices by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of invoices to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the invoice to start after. If not provided, the first page of invoices will be returned.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**approverCount:** `Optional<String>` — Filter invoices by the number of approvers. Use exact number (e.g., 3) or range (e.g., ">3", "<5", ">=2", "<=4").
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on.
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoices by recurring status
    
</dd>
</dl>

<dl>
<dd>

**returnPayerMetadata:** `Optional<Boolean>` — Whether to return payer metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnVendorMetadata:** `Optional<Boolean>` — Whether to return vendor metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnPaymentTiming:** `Optional<Boolean>` — Whether to return payment timing in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.invoice.download(entityGroupId) -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download invoices for an entity group as a CSV/JSON file.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().invoice().download(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    GroupInvoiceDownloadRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .excludeReceivables(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoices by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoices by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter invoices by line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter invoices by line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID. Only invoices with all upstream policies approved will be returned.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoices by recurring status
    
</dd>
</dl>

<dl>
<dd>

**invoiceTemplateId:** `Optional<String>` — Filter invoice by invoice template ID
    
</dd>
</dl>

<dl>
<dd>

**excludePayables:** `Optional<Boolean>` — Return only invoices that are receivable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**excludeReceivables:** `Optional<Boolean>` — Return only invoices that are payable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**returnPayerMetadata:** `Optional<Boolean>` — Whether to return payer metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnVendorMetadata:** `Optional<Boolean>` — Whether to return vendor metadata in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entityGroup.invoice.metrics(entityGroupId) -> List&lt;InvoiceMetricsResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get invoice metrics for an entity group with the given filters. Invoices will be grouped by currency. If none of excludePayables, excludeReceivables, payerId, vendorId, or invoiceId status filters are provided, excludeReceivables will be set to true.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entityGroup().invoice().metrics(
    "entg_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    GroupInvoiceMetricsRequest
        .builder()
        .currency(
            new ArrayList<Optional<CurrencyCode>>(
                Arrays.asList(CurrencyCode.USD)
            )
        )
        .status(
            new ArrayList<Optional<InvoiceStatus>>(
                Arrays.asList(InvoiceStatus.NEW)
            )
        )
        .returnByDate(InvoiceMetricsPerDateGroupBy.CREATION_DATE)
        .excludeReceivables(true)
        .startDate(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
        .endDate(OffsetDateTime.parse("2021-01-31T23:59:59.999Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityGroupId:** `String` — Entity Group ID or Entity Group ForeignID
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**excludePayables:** `Optional<Boolean>` — Only return invoices that are not payable by the entity. This will return only invoices that are receivable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**excludeReceivables:** `Optional<Boolean>` — Only return invoices that are not receivable by the entity. This will return only invoices that are payable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**returnByDate:** `Optional<InvoiceMetricsPerDateGroupBy>` — Return invoice metrics grouped by date.
    
</dd>
</dl>

<dl>
<dd>

**returnByDateFrequency:** `Optional<InvoiceMetricsPerDateFrequency>` — Return invoice metrics grouped by date. Defaults to daily.
    
</dd>
</dl>

<dl>
<dd>

**groupBy:** `Optional<InvoiceMetricsGroupBy>` — Return invoice metrics grouped by.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID.
    
</dd>
</dl>

<dl>
<dd>

**approverCount:** `Optional<String>` — Filter invoices by the number of approvers. Use exact number (e.g., 3) or range (e.g., ">3", "<5", ">=2", "<=4").
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<CurrencyCode>` — Currency to filter on
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity ApprovalPolicy
<details><summary><code>client.entity.approvalPolicy.getAll(entityId) -> List&lt;ApprovalPolicyResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve all invoice approval policies associated with an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().getAll("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.approvalPolicy.create(entityId, request) -> ApprovalPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create an invoice approval policy associated with an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().create(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    ApprovalPolicyRequest
        .builder()
        .trigger(
            new ArrayList<Trigger>()
        )
        .rule(
            Rule.approver(
                ApproverRule
                    .builder()
                    .numApprovers(2)
                    .identifierList(
                        IdentifierList.userList()
                    )
                    .build()
            )
        )
        .upstreamPolicyId("root")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ApprovalPolicyRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.approvalPolicy.get(entityId, policyId) -> ApprovalPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve an invoice approval policy associated with an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "apvl_5ce50275-1789-42ea-bc60-bb7e6d03635c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**policyId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.approvalPolicy.update(entityId, policyId, request) -> ApprovalPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update an invoice approval policy associated with an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().update(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "apvl_5ce50275-1789-42ea-bc60-bb7e6d03635c",
    ApprovalPolicyUpdateRequest
        .builder()
        .trigger(
            new ArrayList<Trigger>()
        )
        .rule(
            Rule.approver(
                ApproverRule
                    .builder()
                    .numApprovers(2)
                    .identifierList(
                        IdentifierList.userList()
                    )
                    .build()
            )
        )
        .upstreamPolicyId("root")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**policyId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `ApprovalPolicyUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.approvalPolicy.delete(entityId, policyId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete an invoice approval policy associated with Entity. BEWARE: Any approval policy deletion will result in all associated downstream policies also being deleted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().delete("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "apvl_5ce50275-1789-42ea-bc60-bb7e6d03635c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**policyId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.approvalPolicy.history(entityId) -> List&lt;ApprovalPolicyHistoryResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve the history of approval policy changes for an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().history("entityId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.approvalPolicy.restore(entityId, approvalPolicyHistoryId) -> List&lt;ApprovalPolicyResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Restore approval policies from a history entry.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().approvalPolicy().restore("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "hist_21661ac1-a2a8-4465-a6c0-64474ba8181d");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**approvalPolicyHistoryId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Bnpl
<details><summary><code>client.entity.bnpl.getLoans(entityId) -> List&lt;BnplLoanResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all BNPL loans associated with an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().bnpl().getLoans("ent_123");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — The ID of the entity to get loans for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Bulk
<details><summary><code>client.entity.bulk.create(request) -> BulkEntityCreationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create multiple entities in bulk. This endpoint will process synchronously and return a list of entities that were created or failed to create.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().bulk().create(
    BulkEntityCreationRequest
        .builder()
        .body(
            BulkEntityCreationRequest.ofBulkEntityCreationFromObject(
                BulkEntityCreationFromObject
                    .builder()
                    .entities(
                        new ArrayList<EntityCreationRequest>(
                            Arrays.asList(
                                EntityCreationRequest
                                    .builder()
                                    .isCustomer(true)
                                    .isPayor(true)
                                    .isPayee(false)
                                    .accountType(AccountType.BUSINESS)
                                    .profile(
                                        ProfileRequest
                                            .builder()
                                            .business(
                                                BusinessProfileRequest
                                                    .builder()
                                                    .legalBusinessName("Acme Inc.")
                                                    .email("customer@acme.com")
                                                    .website("http://www.acme.com")
                                                    .businessType(BusinessType.LLC)
                                                    .phone(
                                                        PhoneNumber
                                                            .builder()
                                                            .countryCode("1")
                                                            .number("4155551234")
                                                            .build()
                                                    )
                                                    .address(
                                                        Address
                                                            .builder()
                                                            .addressLine1("123 Main St")
                                                            .city("San Francisco")
                                                            .stateOrProvince("CA")
                                                            .postalCode("94105")
                                                            .addressLine2("Unit 1")
                                                            .country("US")
                                                            .build()
                                                    )
                                                    .taxId(
                                                        TaxId
                                                            .builder()
                                                            .ein(
                                                                Ein
                                                                    .builder()
                                                                    .number("12-3456789")
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .foreignId("MY-DB-ID-12345")
                                    .build()
                            )
                        )
                    )
                    .connectedEntity(
                        BulkConnectedEntity
                            .builder()
                            .id("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced")
                            .linkCreatedAsPayor(false)
                            .linkCreatedAsPayee(true)
                            .build()
                    )
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**emitWebhooks:** `Optional<Boolean>` — If true, webhooks will be emitted for each entity that is created. By default, webhooks are not emitted.
    
</dd>
</dl>

<dl>
<dd>

**request:** `BulkEntityCreationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.bulk.download() -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download a bulk entity as a CSV/JSON file.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().bulk().download(
    DownloadBulkEntitiesRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — If true, will include entity payment methods as part of the response
    
</dd>
</dl>

<dl>
<dd>

**isCustomer:** `Optional<Boolean>` — If true, only entities with a direct relationship to the requesting organization will be returned. If false or not provided, all entities will be returned.
    
</dd>
</dl>

<dl>
<dd>

**foreignId:** `Optional<String>` — ID used to identify this entity in your system
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<EntityStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**isPayee:** `Optional<Boolean>` 

If true, entities that are marked as payees will be returned.
If false or not provided, entities that are marked as payees will not be returned.
    
</dd>
</dl>

<dl>
<dd>

**isPayor:** `Optional<Boolean>` 

If true or not provided, entities that are marked as payors will be returned.
If false, entities that are marked as payors will not be returned.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Use search instead. Deprecated. Filter entities by name. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find entities by name, email, or emailTo. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter entities by simple key/value metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — Return simple key/value metadata for the specified keys for the entities. For more complex metadata, use the Metadata API.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of entities to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the entity to start after. If not provided, the first page of entities will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Counterparty Bulk
<details><summary><code>client.entity.counterparty.bulk.downloadPayees(entityId) -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download payee counterparties as a CSV/JSON file. This endpoint lets you download vendors linked to the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().bulk().downloadPayees(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    DownloadBulkPayeesRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .paymentMethods(true)
        .invoiceMetrics(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Filter counterparties by name or email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**networkType:** `Optional<CounterpartyNetworkType>` — Filter by network type. By default, only ENTITY counterparties are returned.
    
</dd>
</dl>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — If true, will include counterparty payment methods as part of the response
    
</dd>
</dl>

<dl>
<dd>

**invoiceMetrics:** `Optional<Boolean>` — If true, will include counterparty invoice metrics as part of the response
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `Optional<String>` — Filter by counterparty ids (Foreign ID is supported)
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter counterparties by simple key/value metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — If true, will return simple key/value metadata for the counterparties. For more complex metadata, use the Metadata API.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.bulk.downloadPayors(entityId) -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download payor counterparties as a CSV/JSON file. This endpoint lets you download customers linked to the entity.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().bulk().downloadPayors(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    DownloadBulkPayorsRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .paymentMethods(true)
        .invoiceMetrics(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Filter counterparties by name or email. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**networkType:** `Optional<CounterpartyNetworkType>` — Filter by network type. By default, only ENTITY counterparties are returned.
    
</dd>
</dl>

<dl>
<dd>

**paymentMethods:** `Optional<Boolean>` — If true, will include counterparty payment methods as part of the response
    
</dd>
</dl>

<dl>
<dd>

**invoiceMetrics:** `Optional<Boolean>` — If true, will include counterparty invoice metrics as part of the response
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `Optional<String>` — Filter by counterparty ids (Foreign ID is supported)
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter counterparties by simple key/value metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**returnMetadata:** `Optional<String>` — If true, will return simple key/value metadata for the counterparties. For more complex metadata, use the Metadata API.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Counterparty VendorCredit
<details><summary><code>client.entity.counterparty.vendorCredit.getAll(entityId, counterpartyId) -> FindVendorCreditResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().vendorCredit().getAll("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `String` — Counterparty Entity ID or Counterparty Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.vendorCredit.get(entityId, counterpartyId, vendorCreditId) -> VendorCreditResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().vendorCredit().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d", "vcr_c3f4c87d-794d-4543-9562-575cdddfc0d7");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `String` — Counterparty Entity ID or Counterparty Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**vendorCreditId:** `String` — ID of the vendor credit to retrieve
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.vendorCredit.create(entityId, counterpartyId, request) -> VendorCreditResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().vendorCredit().create(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d",
    VendorCreditRequest
        .builder()
        .totalAmount(100)
        .currency(CurrencyCode.USD)
        .note("This is a note")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `String` — Counterparty Entity ID or Counterparty Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `VendorCreditRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.vendorCredit.delete(entityId, counterpartyId, vendorCreditId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().vendorCredit().delete("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d", "vcr_c3f4c87d-794d-4543-9562-575cdddfc0d7");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `String` — Counterparty Entity ID or Counterparty Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**vendorCreditId:** `String` — ID of the vendor credit to delete
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.counterparty.vendorCredit.estimateUsage(entityId, counterpartyId) -> CalculateVendorCreditUsageResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Estimate the usage of vendor credits on an invoice of a given amount
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().counterparty().vendorCredit().estimateUsage(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "ent_21661ac1-a2a8-4465-a6c0-64474ba8181d",
    CalculateVendorCreditUsageRequest
        .builder()
        .amount(150)
        .currency(CurrencyCode.USD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**counterpartyId:** `String` — Counterparty Entity ID or Counterparty Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Float` — The amount of the invoice to calculate vendor credit usage for.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<CurrencyCode>` — The currency of the invoice to calculate vendor credit usage for. Defaults to USD.
    
</dd>
</dl>

<dl>
<dd>

**excludedInvoiceIds:** `Optional<List<String>>` — List of invoice IDs to exclude from the calculation. If not provided or an empty list, no invoices will be excluded. This is useful for recalculating vendor credit usage on invoices that already have vendor credits applied.
    
</dd>
</dl>

<dl>
<dd>

**includedVendorCreditIds:** `Optional<List<String>>` — List of vendor credit IDs to include in the calculation. If not provided, all applicable vendor credits will be included, while an empty list will not include ANY vendor credits.  This is useful for recalculating vendor credit usage on invoices that have a fixed list of applied vendor credits (e.g. a SCHEDULED or PENDING invoice).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Customization
<details><summary><code>client.entity.customization.get(entityId) -> EntityCustomizationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get entity customization.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().customization().get("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Document
<details><summary><code>client.entity.document.getAll(entityId) -> List&lt;DocumentResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get documents (1099/W9) associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().document().getAll(
    "ent_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9",
    GetDocumentsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<DocumentType>` — Filter by document type
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.document.upload(entityId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Upload documents associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().document().upload(
    "ent_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9",
    UploadDocumentRequest
        .builder()
        .document("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAgAAAAIAQMAAAD+wSzIAAAABlBMVEX///+/v7+jQ3Y5AAAADklEQVQI12P4AIX8EAgALgAD/aNpbtEAAAAASUVORK5CYII")
        .type(DocumentType.TEN_NINETY_NINE)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**document:** `String` — Base64 encoded image or PDF of document. PNG, JPG, WEBP, and PDF are supported. 10MB max.
    
</dd>
</dl>

<dl>
<dd>

**type:** `DocumentType` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.document.delete(entityId, documentId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a document associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().document().delete("ent_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9", "doc_37e6af0a-e637-48fd-b825-d6947b38c4e2");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**documentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity EmailTemplate
<details><summary><code>client.entity.emailTemplate.getAll(entityId) -> List&lt;EmailTemplateResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all email templates for the entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailTemplate().getAll("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.emailTemplate.create(entityId, request) -> EmailTemplateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailTemplate().create(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    EmailTemplateRequest
        .builder()
        .templateType(EmailTemplateType.PAYMENT)
        .name("Generic Payment Email")
        .subject("Action Required - Your payment is due")
        .content("<h1>Your invoice has been sent.</h1>")
        .isDefault(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EmailTemplateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.emailTemplate.get(entityId, emailTemplateId) -> EmailTemplateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get entity email template
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailTemplate().get("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced", "emt_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**emailTemplateId:** `String` — Email Template ID or Email Template ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.emailTemplate.update(entityId, emailTemplateId, request) -> EmailTemplateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update entity email template
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailTemplate().update(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    "emt_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EmailTemplateRequest
        .builder()
        .templateType(EmailTemplateType.PAYMENT)
        .name("Generic Payment Email")
        .subject("Action Required - Your payment is due")
        .content("<h1>Your invoice has been sent.</h1>")
        .isDefault(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**emailTemplateId:** `String` — Email Template ID or Email Template ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `EmailTemplateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.emailTemplate.delete(entityId, emailTemplateId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete entity email template. This will also remove the email template from all entities.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().emailTemplate().delete("entityId", "emailTemplateId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**emailTemplateId:** `String` — Email Template ID or Email Template ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity ExternalAccountingSystem
<details><summary><code>client.entity.externalAccountingSystem.get(entityId) -> ExternalAccountingSystemCompanyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the external accounting system connected to an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().externalAccountingSystem().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.externalAccountingSystem.create(entityId, request) -> ExternalAccountingSystemCompanyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create/Link an entity to an external accounting system like Codat or Rutter. If the entity is already linked to an external accounting system, this will return the existing connection.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().externalAccountingSystem().create(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    ExternalAccountingSystemCompanyCreationRequest.rutter(
        RutterCompanyCreationRequest
            .builder()
            .accessToken("123")
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ExternalAccountingSystemCompanyCreationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.externalAccountingSystem.connect(entityId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a link to connect an entity to an external accounting system like Quickbooks or Xero
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().externalAccountingSystem().connect("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.externalAccountingSystem.sync(entityId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Sync an entity with an external accounting system. Will sync customers/vendors and invoices.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().externalAccountingSystem().sync(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    SyncExternalSystemRequest
        .builder()
        .vendors(SyncType.PULL)
        .bills(SyncType.PUSH)
        .glAccounts(SyncType.PULL)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**vendors:** `Optional<SyncType>` — Sync vendors from external accounting system. Default is to pull vendors from external system.
    
</dd>
</dl>

<dl>
<dd>

**bills:** `Optional<SyncType>` — Sync bills from external accounting system. Default is to not sync bills. Invoices that already exist in both systems will not be updated, only new invoices not present in the other system will be created.
    
</dd>
</dl>

<dl>
<dd>

**glAccounts:** `Optional<SyncType>` — Sync GL accounts from external accounting system. Default is to pull GL accounts from external system. Pushing GL accounts is not supported.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Invoice
<details><summary><code>client.entity.invoice.find(entityId) -> FindInvoiceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get invoices for an entity with the given filters.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().invoice().find(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    EntityGetInvoicesRequest
        .builder()
        .excludeReceivables(true)
        .orderBy(InvoiceOrderByField.CREATED_AT)
        .orderDirection(OrderDirection.ASC)
        .limit(10)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**excludePayables:** `Optional<Boolean>` — Return only invoices that are receivable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**excludeReceivables:** `Optional<Boolean>` — Return only invoices that are payable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoices by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoices by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of invoices to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the invoice to start after. If not provided, the first page of invoices will be returned.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter invoices by line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter invoices by line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**approverCount:** `Optional<String>` — Filter invoices by the number of approvers. Use exact number (e.g., 3) or range (e.g., ">3", "<5", ">=2", "<=4").
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on.
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoices by payment type.
    
</dd>
</dl>

<dl>
<dd>

**returnPayerMetadata:** `Optional<Boolean>` — Whether to return payer metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnVendorMetadata:** `Optional<Boolean>` — Whether to return vendor metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnPaymentTiming:** `Optional<Boolean>` — Whether to return payment timing in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.invoice.get(entityId, invoiceId) -> InvoiceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().invoice().get("entityId", "invoiceId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `String` — ID of the invoice to retrieve. This can be the full invoice ID (in_11aa2b77-6391-49e4-8c3f-b198009202c1) or the first 8 characters of the ID (11aa2b77).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.invoice.metrics(entityId) -> List&lt;InvoiceMetricsResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get invoice metrics for an entity with the given filters. Invoices will always be grouped by currency. If none of excludePayables, excludeReceivables, payerId, vendorId, or invoiceId status filters are provided, excludeReceivables will be set to true.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().invoice().metrics(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    InvoiceMetricsRequest
        .builder()
        .currency(
            new ArrayList<Optional<CurrencyCode>>(
                Arrays.asList(CurrencyCode.USD)
            )
        )
        .status(
            new ArrayList<Optional<InvoiceStatus>>(
                Arrays.asList(InvoiceStatus.NEW)
            )
        )
        .returnByDate(InvoiceMetricsPerDateGroupBy.CREATION_DATE)
        .excludeReceivables(true)
        .startDate(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
        .endDate(OffsetDateTime.parse("2021-01-31T23:59:59.999Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**excludePayables:** `Optional<Boolean>` — Only return invoices that are not payable by the entity. This will return only invoices that are receivable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**excludeReceivables:** `Optional<Boolean>` — Only return invoices that are not receivable by the entity. This will return only invoices that are payable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**returnByDate:** `Optional<InvoiceMetricsPerDateGroupBy>` — Return invoice metrics grouped by date.
    
</dd>
</dl>

<dl>
<dd>

**returnByDateFrequency:** `Optional<InvoiceMetricsPerDateFrequency>` — Return invoice metrics grouped by date. Defaults to daily.
    
</dd>
</dl>

<dl>
<dd>

**groupBy:** `Optional<InvoiceMetricsGroupBy>` — Return invoice metrics grouped by.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID.
    
</dd>
</dl>

<dl>
<dd>

**approverCount:** `Optional<String>` — Filter invoices by the number of approvers. Use exact number (e.g., 3) or range (e.g., ">3", "<5", ">=2", "<=4").
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<CurrencyCode>` — Currency to filter on
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.invoice.download(entityId) -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download invoices for an entity as a CSV/JSON file.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().invoice().download(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    DownloadEntityInvoicesRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**excludePayables:** `Optional<Boolean>` — Return only invoices that are receivable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**excludeReceivables:** `Optional<Boolean>` — Return only invoices that are payable by the entity.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoices by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoices by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter invoices by line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter invoices by line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on.
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoices by payment type.
    
</dd>
</dl>

<dl>
<dd>

**returnPayerMetadata:** `Optional<Boolean>` — Whether to return payer metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnVendorMetadata:** `Optional<Boolean>` — Whether to return vendor metadata in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Metadata
<details><summary><code>client.entity.metadata.getAll(entityId) -> List&lt;EntityMetadataResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve all metadata options associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().metadata().getAll("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.metadata.get(entityId, key) -> List&lt;String&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve metadata associated with a specific key
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().metadata().get("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced", "propertyId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**key:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.metadata.update(entityId, key, request) -> List&lt;String&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update metadata associated with a specific key
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().metadata().update(
    "ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    "propertyId",
    new ArrayList<String>(
        Arrays.asList("{key: 'prop_123', value: 'Beach Rental'}", "{key: 'prop_456', value: 'City Rental'}")
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**key:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `List<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.metadata.delete(entityId, key)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete all metadata associated with a specific key
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().metadata().delete("ent_a0f6ea94-0761-4a5e-a416-3c453cb7eced", "propertyId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**key:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity NotificationPolicy
<details><summary><code>client.entity.notificationPolicy.getAll(entityId) -> List&lt;NotificationPolicyResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve all notification policies associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().notificationPolicy().getAll("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.notificationPolicy.get(entityId, notificationType) -> NotificationPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve notification policy associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().notificationPolicy().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", NotificationType.INVOICE_APPROVAL_NEEDED);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.notificationPolicy.update(entityId, notificationType, request) -> NotificationPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update notification policy associated with this entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().notificationPolicy().update(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    NotificationType.INVOICE_APPROVAL_NEEDED,
    NotificationPolicyRequest
        .builder()
        .disabled(false)
        .additionalRoles(
            new ArrayList<String>(
                Arrays.asList("admin", "approver")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `NotificationPolicyRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity PaymentMethod BankAccount
<details><summary><code>client.entity.paymentMethod.bankAccount.initiateMicroDeposits(entityId, paymentMethodId) -> PaymentMethodResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Initiate micro deposits for a bank account
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().bankAccount().initiateMicroDeposits("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "pm_4794d597-70dc-4fec-b6ec-c5988e759769");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.bankAccount.completeMicroDeposits(entityId, paymentMethodId, request) -> PaymentMethodResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Complete micro deposit verification
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().bankAccount().completeMicroDeposits(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    CompleteMicroDepositsRequest
        .builder()
        .amounts(
            new ArrayList<Integer>(
                Arrays.asList(40, 2)
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**amounts:** `List<Integer>` — The amounts of the micro deposits in cents
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.bankAccount.getAccelerationFunds(entityId, paymentMethodId) -> AccelerationFundsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the available and pending balance of this entity's acceleration funds. The specified payment method must be a bank account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().bankAccount().getAccelerationFunds("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "pm_4794d597-70dc-4fec-b6ec-c5988e759769");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.bankAccount.addAccelerationFunds(entityId, paymentMethodId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Add acceleration funds to this entity from a bank account (this transfer is D+2). The specified payment method must be a bank account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().bankAccount().addAccelerationFunds(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    AddAccelerationFundsRequest
        .builder()
        .amount(100)
        .currency(CurrencyCode.USD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Float` — The amount of the acceleration funds to add. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `CurrencyCode` — The currency of the acceleration funds to add.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.bankAccount.removeAccelerationFunds(entityId, paymentMethodId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Remove acceleration funds from this entity to a bank account (this transfer is D+0). The specified payment method must be a bank account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().bankAccount().removeAccelerationFunds(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    RemoveAccelerationFundsRequest
        .builder()
        .amount(100)
        .currency(CurrencyCode.USD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Float` — The amount of the acceleration funds to remove. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `CurrencyCode` — The currency of the acceleration funds to remove.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.bankAccount.getBalance(entityId, paymentMethodId) -> PaymentMethodBalanceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deprecated. Get the available balance of a payment method. Only bank accounts added with Plaid are supported. This endpoint will return a cached value and will refresh the balance when called.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().bankAccount().getBalance("entityId", "paymentMethodId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity PaymentMethod Wallet
<details><summary><code>client.entity.paymentMethod.wallet.getWalletBalance(entityId, paymentMethodId) -> WalletBalanceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the available and pending balance of this entity's wallet. The specified payment method ID must refer to the entity's wallet.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().wallet().getWalletBalance("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "pm_4794d597-70dc-4fec-b6ec-c5988e759769");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.wallet.addWalletFunds(entityId, paymentMethodId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Add funds to this wallet from a bank account (this transfer is D+2). The source payment method ID must refer to a bank account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().wallet().addWalletFunds(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    AddWalletFundsRequest
        .builder()
        .amount(100)
        .sourcePaymentMethodId("pm_f19d27ad-e493-4bf5-a28b-9cb323de495a")
        .currency(CurrencyCode.USD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Float` — The amount of the funds to add. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<CurrencyCode>` — The currency of the funds to add. (Defaults to USD, currently only USD is supported.)
    
</dd>
</dl>

<dl>
<dd>

**sourcePaymentMethodId:** `String` — The ID of the bank account to add funds from. The source payment method ID must refer to a bank account.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.paymentMethod.wallet.withdrawWalletFunds(entityId, paymentMethodId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Withdraw funds from this wallet to a bank account (this transfer is D+0). The destination payment method ID must refer to a bank account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().paymentMethod().wallet().withdrawWalletFunds(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "pm_4794d597-70dc-4fec-b6ec-c5988e759769",
    WithdrawWalletFundsRequest
        .builder()
        .amount(100)
        .destinationPaymentMethodId("pm_f19d27ad-e493-4bf5-a28b-9cb323de495a")
        .currency(CurrencyCode.USD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**paymentMethodId:** `String` — Payment Method ID or Payment Method ForeignID
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Float` — The amount of the funds to withdraw. If the entered amount has more decimal places than the currency supports, trailing decimals will be truncated.
    
</dd>
</dl>

<dl>
<dd>

**currency:** `Optional<CurrencyCode>` — The currency of the funds to withdraw. (Defaults to USD, currently only USD is supported.)
    
</dd>
</dl>

<dl>
<dd>

**destinationPaymentMethodId:** `String` — The ID of the bank account to withdraw funds to. The destination payment method ID must refer to a bank account.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity Representative
<details><summary><code>client.entity.representative.getAll(entityId) -> List&lt;RepresentativeResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get representatives for an entity
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().representative().getAll("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.representative.create(entityId, request) -> RepresentativeResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().representative().create(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    RepresentativeRequest
        .builder()
        .name(
            FullName
                .builder()
                .firstName("John")
                .lastName("Adams")
                .middleName("Quincy")
                .suffix("Jr.")
                .build()
        )
        .address(
            Address
                .builder()
                .addressLine1("123 Main St")
                .city("San Francisco")
                .stateOrProvince("CA")
                .postalCode("94105")
                .addressLine2("Unit 1")
                .country("US")
                .build()
        )
        .birthDate(
            BirthDate
                .builder()
                .day("1")
                .month("1")
                .year("1980")
                .build()
        )
        .governmentId(
            IndividualGovernmentId
                .builder()
                .ssn("123-45-6789")
                .build()
        )
        .responsibilities(
            Responsibilities
                .builder()
                .isOwner(true)
                .ownershipPercentage(40)
                .isController(true)
                .build()
        )
        .phone(
            PhoneNumber
                .builder()
                .countryCode("1")
                .number("4155551234")
                .build()
        )
        .email("john.doe@acme.com")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `RepresentativeRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.representative.get(entityId, representativeId) -> RepresentativeResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().representative().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "rep_7df2974a-4069-454c-912f-7e58ebe030fb");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**representativeId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.representative.update(entityId, representativeId, request) -> RepresentativeResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().representative().update(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "rep_7df2974a-4069-454c-912f-7e58ebe030fb",
    RepresentativeUpdateRequest
        .builder()
        .name(
            FullName
                .builder()
                .firstName("John")
                .lastName("Adams")
                .middleName("Quincy")
                .suffix("Jr.")
                .build()
        )
        .phone(
            PhoneNumber
                .builder()
                .countryCode("1")
                .number("4155551234")
                .build()
        )
        .email("john.doe@acme.com")
        .address(
            Address
                .builder()
                .addressLine1("123 Main St")
                .city("San Francisco")
                .stateOrProvince("CA")
                .postalCode("94105")
                .addressLine2("Unit 1")
                .country("US")
                .build()
        )
        .birthDate(
            BirthDate
                .builder()
                .day("1")
                .month("1")
                .year("1980")
                .build()
        )
        .governmentId(
            IndividualGovernmentId
                .builder()
                .ssn("123-45-6789")
                .build()
        )
        .responsibilities(
            Responsibilities
                .builder()
                .isOwner(true)
                .ownershipPercentage(40)
                .isController(true)
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**representativeId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `RepresentativeUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.representative.delete(entityId, representativeId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().representative().delete("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "rep_7df2974a-4069-454c-912f-7e58ebe030fb");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**representativeId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity User NotificationPolicy
<details><summary><code>client.entity.user.notificationPolicy.getAll(entityId, userId) -> List&lt;UserNotificationPolicyResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve all notification policies associated with this entity user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().notificationPolicy().getAll("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "user_e24fc81c-c5ee-47e8-af42-4fe29d895506");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.notificationPolicy.get(entityId, userId, notificationType) -> UserNotificationPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve notification policy associated with this entity user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().notificationPolicy().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "user_e24fc81c-c5ee-47e8-af42-4fe29d895506", NotificationType.INVOICE_APPROVED);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.notificationPolicy.update(entityId, userId, notificationType, request) -> UserNotificationPolicyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update notification policy associated with this entity user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().notificationPolicy().update(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "user_e24fc81c-c5ee-47e8-af42-4fe29d895506",
    NotificationType.INVOICE_APPROVED,
    UserNotificationPolicyRequest
        .builder()
        .disabled(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `UserNotificationPolicyRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Entity User Notifications
<details><summary><code>client.entity.user.notifications.find(entityId, userId) -> FindNotificationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().notifications().find(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "user_e24fc81c-c5ee-47e8-af42-4fe29d895506",
    EntityGetNotificationsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date for notification created on date filter.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date for notification created date filter.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order notifications by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of invoices to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the notification to start after. If not provided, the first page of invoices will be returned.
    
</dd>
</dl>

<dl>
<dd>

**notificationType:** `Optional<NotificationType>` — The type of notification to filter by.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<NotificationStatus>` — The status of the notification to filter by.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.notifications.get(entityId, userId, notificationId) -> NotificationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().notifications().get("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c", "user_e24fc81c-c5ee-47e8-af42-4fe29d895506", "notif_7df2974a-4069-454c-912f-7e58ebe030fb");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**notificationId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.entity.user.notifications.update(entityId, userId, notificationId, request) -> NotificationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update the status of a notification.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.entity().user().notifications().update(
    "ent_8545a84e-a45f-41bf-bdf1-33b42a55812c",
    "user_e24fc81c-c5ee-47e8-af42-4fe29d895506",
    "notif_7df2974a-4069-454c-912f-7e58ebe030fb",
    NotificationUpdateRequest
        .builder()
        .status(NotificationStatus.READ)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `String` — Entity ID or Entity ForeignID
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — User ID or User ForeignID
    
</dd>
</dl>

<dl>
<dd>

**notificationId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `NotificationUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## InvoiceTemplate Approval
<details><summary><code>client.invoiceTemplate.approval.addApprover(invoiceTemplateId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds an approver to the invoice template. Will select the first available approver slot that is not already filled and assign the approver to it. If no approver slots are available, an error will be returned. An explicit approver slot can be specified by setting the `approverSlot` field.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().approval().addApprover(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    AddApproverRequest
        .builder()
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .approvalSlotId("inap_9bb311c9-7c15-4c9e-8148-63814e0abec6")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `AddApproverRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.approval.approve(invoiceTemplateId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().approval().approve(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    ApprovalRequest
        .builder()
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .text("This is a reason for my action")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ApprovalRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.approval.reject(invoiceTemplateId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().approval().reject(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    ApprovalRequest
        .builder()
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .text("This is a reason for my action")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ApprovalRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## InvoiceTemplate Document
<details><summary><code>client.invoiceTemplate.document.getAll(invoiceTemplateId) -> List&lt;DocumentResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get attachments (scanned/uploaded PDFs and images) associated with this invoice template
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().document().getAll(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    GetDocumentsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<DocumentType>` — Filter by document type
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.document.upload(invoiceTemplateId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Upload documents (scanned/uploaded PDFs and images) associated with this invoice template
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().document().upload(
    "invt_13c07096-5848-4aeb-ae7d-6576289034c4",
    UploadDocumentRequest
        .builder()
        .document("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAgAAAAIAQMAAAD+wSzIAAAABlBMVEX///+/v7+jQ3Y5AAAADklEQVQI12P4AIX8EAgALgAD/aNpbtEAAAAASUVORK5CYII")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**document:** `String` — Base64-encoded string. Supported file types include PNG, JPG, WEBP, PDF, and all Microsoft Office formats (automatically converted to PDF). Max file size 10MB.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<DocumentType>` — Specify Document Type, defaults to INVOICE
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.document.delete(invoiceTemplateId, documentId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete an attachment (scanned/uploaded PDFs and images) associated with this invoice template
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().document().delete("invt_13c07096-5848-4aeb-ae7d-6576289034c4", "doc_37e6af0a-e637-48fd-b825-d6947b38c4e2");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>

<dl>
<dd>

**documentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.document.generateInvoicePdf(invoiceTemplateId) -> DocumentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a PDF of the invoice. This PDF is generated from the data in the invoice, not from the uploaded documents.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().document().generateInvoicePdf("invt_13c07096-5848-4aeb-ae7d-6576289034c4");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.document.generateCheckPdf(invoiceTemplateId) -> DocumentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a PDF of the check for the invoice. If the invoice does not have check as the disbursement method, an error will be returned. If the disbursement option for the check is set to 'MAIL', a void copy of the check will be returned. If the disbursement option for the check is set to 'PRINT', a printable check will be returned. If the invoice is NOT marked as PAID, the check will be a void copy.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().document().generateCheckPdf("invt_13c07096-5848-4aeb-ae7d-6576289034c4");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoiceTemplate.document.getSourceEmail(invoiceTemplateId) -> EmailLogResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the email subject and body that was used to create this invoice.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoiceTemplate().document().getSourceEmail("invt_13c07096-5848-4aeb-ae7d-6576289034c4");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceTemplateId:** `String` — Invoice Template ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice Approval
<details><summary><code>client.invoice.approval.addApprover(invoiceId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds an approver to the invoice. Will select the first available approver slot that is not already filled and assign the approver to it. If no approver slots are available, an error will be returned. An explicit approver slot can be specified by setting the `approverSlot` field.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().approval().addApprover(
    "in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    AddApproverRequest
        .builder()
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .approvalSlotId("inap_9bb311c9-7c15-4c9e-8148-63814e0abec6")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `AddApproverRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.approval.approve(invoiceId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().approval().approve(
    "in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    ApprovalRequest
        .builder()
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .text("This is a reason for my action")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ApprovalRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.approval.reject(invoiceId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().approval().reject(
    "in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    ApprovalRequest
        .builder()
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .text("This is a reason for my action")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `ApprovalRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice Bnpl
<details><summary><code>client.invoice.bnpl.offer(invoiceId, request) -> BnplOfferResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a BNPL offer for an invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().bnpl().offer(
    "in_286a1849-2e3c-48a4-ab5a-8b7940cc3a5b",
    BnplOfferRequest
        .builder()
        .cadence(BnplCadence.WEEKLY)
        .installmentsStartDate("2025-06-18")
        .numberOfInstallments(4)
        .paymentDayOfWeek(BnplDayOfWeek.WEDNESDAY)
        .downPaymentDueDate("2025-06-11")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `BnplOfferRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.bnpl.loan(loanId) -> BnplLoanResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get information about a specific BNPL loan by loan ID
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().bnpl().loan("684adb5d70a01b00596a3106");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**loanId:** `String` — The ID of the loan to retrieve
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice Bulk
<details><summary><code>client.invoice.bulk.create(request) -> BulkInvoiceCreationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were created or failed to create.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().bulk().create(
    BulkInvoiceCreationRequest
        .builder()
        .body(
            BulkInvoiceCreationRequest
                .builder()
                .invoices(
                    new ArrayList<InvoiceCreationRequest>(
                        Arrays.asList(
                            InvoiceCreationRequest.ofInvoiceCreationWithEntityRequest(
                                InvoiceCreationWithEntityRequest
                                    .builder()
                                    .creatorEntityId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
                                    .status(InvoiceStatus.NEW)
                                    .amount(100)
                                    .currency(CurrencyCode.USD)
                                    .invoiceDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                    .dueDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
                                    .invoiceNumber("INV-123")
                                    .noteToSelf("For the month of January")
                                    .payerId("ent_8545a84e-a45f-41bf-bdf1-33b42a55812c")
                                    .paymentSourceId("pm_4794d597-70dc-4fec-b6ec-c5988e759769")
                                    .vendorId("ent_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                                    .paymentDestinationId("pm_5fde2f4a-facc-48ef-8f0d-6b7d087c7b18")
                                    .paymentDestinationOptions(
                                        PaymentDestinationOptions.check(
                                            CheckPaymentDestinationOptions
                                                .builder()
                                                .delivery(CheckDeliveryMethod.MAIL)
                                                .printDescription(true)
                                                .build()
                                        )
                                    )
                                    .lineItems(
                                        new ArrayList<InvoiceLineItemCreationRequest>(
                                            Arrays.asList(
                                                InvoiceLineItemCreationRequest
                                                    .builder()
                                                    .amount(100)
                                                    .currency(CurrencyCode.USD)
                                                    .description("Product A")
                                                    .name("Product A")
                                                    .quantity(1)
                                                    .unitPrice(100)
                                                    .category("EXPENSE")
                                                    .serviceStartDate(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                                    .serviceEndDate(OffsetDateTime.parse("2021-01-31T00:00:00Z"))
                                                    .metadata(
                                                        new HashMap<String, String>() {{
                                                            put("key1", "value1");
                                                            put("key2", "value2");
                                                        }}
                                                    )
                                                    .glAccountId("600394")
                                                    .build()
                                            )
                                        )
                                    )
                                    .creatorUserId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
                                    .build()
                            )
                        )
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**emitWebhooks:** `Optional<Boolean>` — If true, webhooks will be emitted for each invoice that is created. By default, webhooks are not emitted.
    
</dd>
</dl>

<dl>
<dd>

**request:** `BulkInvoiceCreationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.bulk.update(request) -> BulkInvoiceUpdateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were updated or failed to update.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().bulk().update(
    BulkInvoiceUpdateRequest
        .builder()
        .body(
            BulkInvoiceUpdateRequest
                .builder()
                .invoices(
                    new ArrayList<InvoiceUpdateRequestWithId>(
                        Arrays.asList(
                            InvoiceUpdateRequestWithId
                                .builder()
                                .invoiceId("inv_21661ac1-a2a8-4465-a6c0-64474ba8181d")
                                .status(InvoiceStatus.NEW)
                                .amount(100)
                                .currency(CurrencyCode.USD)
                                .dueDate(OffsetDateTime.parse("2024-01-31T00:00:00Z"))
                                .invoiceDate(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                                .invoiceNumber("INV-001")
                                .lineItems(
                                    new ArrayList<InvoiceLineItemUpdateRequest>(
                                        Arrays.asList(
                                            InvoiceLineItemUpdateRequest
                                                .builder()
                                                .description("Item 1")
                                                .amount(50)
                                                .quantity(1)
                                                .build(),
                                            InvoiceLineItemUpdateRequest
                                                .builder()
                                                .description("Item 2")
                                                .amount(50)
                                                .quantity(1)
                                                .build()
                                        )
                                    )
                                )
                                .build()
                        )
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**emitWebhooks:** `Optional<Boolean>` — If true, webhooks will be emitted for each invoice that is updated. By default, webhooks are not emitted.
    
</dd>
</dl>

<dl>
<dd>

**request:** `BulkInvoiceUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.bulk.approve(request) -> BulkInvoiceApprovalResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Approve multiple invoices in bulk. This endpoint will process synchronously and return a list of invoices that were approved or failed to approve.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().bulk().approve(
    BulkInvoiceApprovalRequest
        .builder()
        .body(
            BulkInvoiceApprovalRequest
                .builder()
                .invoices(
                    new ArrayList<ApprovalRequestWithId>(
                        Arrays.asList(
                            ApprovalRequestWithId
                                .builder()
                                .invoiceId("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9")
                                .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
                                .text("This is a reason for my action")
                                .build()
                        )
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**emitWebhooks:** `Optional<Boolean>` — If true, webhooks will be emitted for each invoice that is approved. By default, webhooks are not emitted.
    
</dd>
</dl>

<dl>
<dd>

**request:** `BulkInvoiceApprovalRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.bulk.download() -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download a bulk invoice as a CSV/JSON file.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().bulk().download(
    DownloadBulkInvoicesRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**entityId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the entity that is the payer or the vendor of the invoice.
    
</dd>
</dl>

<dl>
<dd>

**entityGroupId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the entity group that the entity belongs to.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter. Defaults to CREATED_AT unless specified the dateType is specified
    
</dd>
</dl>

<dl>
<dd>

**dateType:** `Optional<InvoiceDateFilter>` — Type of date to filter by if startDate and endDate filters are provided. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<InvoiceOrderByField>` — Field to order invoices by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order invoices by. Defaults to asc.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the invoice to start after. If not provided, the first page of invoices will be returned.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find invoices by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter invoices by metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter invoices by line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter invoices by line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter invoices by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter invoices by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter invoices by the ID or foreign ID of the user that created the invoice.
    
</dd>
</dl>

<dl>
<dd>

**approverId:** `Optional<String>` — Filter invoices by assigned approver user ID. Only invoices with all upstream policies approved will be returned.
    
</dd>
</dl>

<dl>
<dd>

**approverAction:** `Optional<ApproverAction>` — Filter invoices by approver action. Needs to be used with approverId. For example, if you want to find all invoices that have been approved by a specific user, you would use approverId and approverAction=APPROVE.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter invoices by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<InvoiceStatus>` — Invoice status to filter on
    
</dd>
</dl>

<dl>
<dd>

**paymentType:** `Optional<List<PaymentType>>` — Filter invoices by recurring status
    
</dd>
</dl>

<dl>
<dd>

**invoiceTemplateId:** `Optional<String>` — Filter invoice by invoice template ID
    
</dd>
</dl>

<dl>
<dd>

**returnPayerMetadata:** `Optional<Boolean>` — Whether to return payer metadata in the response
    
</dd>
</dl>

<dl>
<dd>

**returnVendorMetadata:** `Optional<Boolean>` — Whether to return vendor metadata in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice Collection
<details><summary><code>client.invoice.collection.getNextAction(invoiceId) -> Optional&lt;ActionResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the collection agent's next action on this invoice. This endpoint will return an empty object if there is no action to return.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().collection().getNextAction("in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.collection.updateNextAction(invoiceId, request) -> ActionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update the collection agent's next action on this invoice with natural language. Note that updating any APPROVED action will reset the action to SUGGESTED.  This endpoint will throw an error if there is no action to update.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().collection().updateNextAction(
    "in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    UpdateNextActionRequest
        .builder()
        .feedback("Use a more stern tone")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `UpdateNextActionRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.collection.approveNextAction(invoiceId) -> ActionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Approve the collection agent's next action on this invoice. This endpoint will throw an error if there is no action to approve.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().collection().approveNextAction("in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice Comment
<details><summary><code>client.invoice.comment.getAll(invoiceId) -> List&lt;CommentResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get all comments associated with this invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().comment().getAll("in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.comment.create(invoiceId, request) -> CommentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Add a comment to this invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().comment().create(
    "in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    CommentRequest
        .builder()
        .text("This is a comment")
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**request:** `CommentRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.comment.get(invoiceId, commentId) -> CommentResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().comment().get("in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff", "ic_3d61faa9-1754-4b7b-9fcb-88ff97f368ff");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**commentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.comment.update(invoiceId, commentId, request) -> CommentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Edit a comment on this invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().comment().update(
    "in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    "ic_3d61faa9-1754-4b7b-9fcb-88ff97f368ff",
    CommentRequest
        .builder()
        .text("This is a comment")
        .userId("user_e24fc81c-c5ee-47e8-af42-4fe29d895506")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**commentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `CommentRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.comment.delete(invoiceId, commentId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a comment on this invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().comment().delete("in_3d61faa9-1754-4b7b-9fcb-88ff97f368ff", "ic_3d61faa9-1754-4b7b-9fcb-88ff97f368ff");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**commentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice Document
<details><summary><code>client.invoice.document.getAll(invoiceId) -> List&lt;DocumentResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get attachments (scanned/uploaded PDFs and images) associated with this invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().getAll(
    "in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9",
    GetDocumentsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<DocumentType>` — Filter by document type
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.document.upload(invoiceId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Upload documents (scanned/uploaded PDFs and images) associated with this Invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().upload(
    "in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9",
    UploadDocumentRequest
        .builder()
        .document("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAgAAAAIAQMAAAD+wSzIAAAABlBMVEX///+/v7+jQ3Y5AAAADklEQVQI12P4AIX8EAgALgAD/aNpbtEAAAAASUVORK5CYII")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**document:** `String` — Base64-encoded string. Supported file types include PNG, JPG, WEBP, PDF, and all Microsoft Office formats (automatically converted to PDF). Max file size 10MB.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<DocumentType>` — Specify Document Type, defaults to INVOICE
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.document.delete(invoiceId, documentId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete an attachment (scanned/uploaded PDFs and images) associated with this invoice
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().delete("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9", "doc_37e6af0a-e637-48fd-b825-d6947b38c4e2");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**documentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.document.generateInvoicePdf(invoiceId) -> DocumentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a PDF of the invoice. This PDF is generated from the data in the invoice, not from the uploaded documents.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().generateInvoicePdf("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.document.generateCheckPdf(invoiceId) -> DocumentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a PDF of the check for the invoice. If the invoice does not have check as the disbursement method, an error will be returned. If the disbursement option for the check is set to 'MAIL', a void copy of the check will be returned. If the disbursement option for the check is set to 'PRINT', a printable check will be returned. If the invoice is NOT marked as PAID, the check will be a void copy.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().generateCheckPdf("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.document.generatePaymentConfirmationPdf(invoiceId) -> DocumentResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a PDF of the payment confirmation for the invoice. This PDF is generated from the data in the invoice, not from the uploaded documents.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().generatePaymentConfirmationPdf("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.document.getSourceEmail(invoiceId) -> EmailLogResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the email subject and body that was used to create this invoice.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().document().getSourceEmail("in_26e7b5d3-a739-4b23-9ad9-6aaa085f47a9");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Invoice PaymentLinks
<details><summary><code>client.invoice.paymentLinks.getPayerLink(invoiceId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get temporary link for payer to send payment
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().paymentLinks().getPayerLink(
    "in_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    PayerLinkRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**expiresIn:** `Optional<String>` — Expressed in seconds or a string describing a time span. The default is 30d.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.paymentLinks.sendPayerEmail(invoiceId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Trigger email to payer inviting them to make payment
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().paymentLinks().sendPayerEmail(
    "in_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    SendPayerEmail
        .builder()
        .attachInvoice(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**attachInvoice:** `Optional<Boolean>` — Whether to attach the invoice to the email
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.paymentLinks.getVendorLink(invoiceId) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get temporary link for vendor to accept payment
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().paymentLinks().getVendorLink(
    "in_a0f6ea94-0761-4a5e-a416-3c453cb7eced",
    VendorLinkRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>

<dl>
<dd>

**expiresIn:** `Optional<String>` — Expressed in seconds or a string describing a time span. The default is 30d.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.invoice.paymentLinks.sendVendorEmail(invoiceId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Trigger email to vendor inviting them into the vendor portal
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.invoice().paymentLinks().sendVendorEmail("in_a0f6ea94-0761-4a5e-a416-3c453cb7eced");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invoiceId:** `String` — Invoice ID or Invoice ForeignID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Moov
<details><summary><code>client.moov.moovTransferCallback(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.moov().moovTransferCallback(
    MoovTransferCallback
        .builder()
        .xAccountId("X-Account-ID")
        .xSignature("X-Signature")
        .xTimestamp("X-Timestamp")
        .xNonce("X-Nonce")
        .xWebhookId("X-Webhook-ID")
        .body(
            MoovTransferCallbackBody
                .builder()
                .data(
                    MoovTransferData
                        .builder()
                        .accountId("accountID")
                        .transferId("transferID")
                        .status("status")
                        .source(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .destination(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .build()
                )
                .eventId("eventID")
                .type("type")
                .createdOn("createdOn")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**xAccountId:** `String` — The Moov account ID
    
</dd>
</dl>

<dl>
<dd>

**xSignature:** `String` — The Moov signature
    
</dd>
</dl>

<dl>
<dd>

**xTimestamp:** `String` — The Moov timestamp
    
</dd>
</dl>

<dl>
<dd>

**xNonce:** `String` — The Moov nonce
    
</dd>
</dl>

<dl>
<dd>

**xWebhookId:** `String` — The Moov webhook ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `MoovTransferCallbackBody` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.moov.moovAccountCallback(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.moov().moovAccountCallback(
    MoovAccountCallback
        .builder()
        .xAccountId("X-Account-ID")
        .xSignature("X-Signature")
        .xTimestamp("X-Timestamp")
        .xNonce("X-Nonce")
        .xWebhookId("X-Webhook-ID")
        .body(
            MoovAccountCallbackBody
                .builder()
                .data(
                    MoovAccountData
                        .builder()
                        .accountId("accountID")
                        .foreignId("foreignID")
                        .build()
                )
                .eventId("eventID")
                .type("type")
                .createdOn("createdOn")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**xAccountId:** `String` — The Moov account ID
    
</dd>
</dl>

<dl>
<dd>

**xSignature:** `String` — The Moov signature
    
</dd>
</dl>

<dl>
<dd>

**xTimestamp:** `String` — The Moov timestamp
    
</dd>
</dl>

<dl>
<dd>

**xNonce:** `String` — The Moov nonce
    
</dd>
</dl>

<dl>
<dd>

**xWebhookId:** `String` — The Moov webhook ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `MoovAccountCallbackBody` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.moov.moovBankAccountCallback(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.moov().moovBankAccountCallback(
    MoovBankAccountCallback
        .builder()
        .xAccountId("X-Account-ID")
        .xSignature("X-Signature")
        .xTimestamp("X-Timestamp")
        .xNonce("X-Nonce")
        .xWebhookId("X-Webhook-ID")
        .body(
            MoovBankAccountCallbackBody
                .builder()
                .data(
                    MoovBankAccountData
                        .builder()
                        .bankAccountId("bankAccountID")
                        .accountId("accountID")
                        .status(MoovBankAccountStatus.NEW)
                        .statusReason("statusReason")
                        .build()
                )
                .eventId("eventID")
                .type("type")
                .createdOn("createdOn")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**xAccountId:** `String` — The Moov account ID
    
</dd>
</dl>

<dl>
<dd>

**xSignature:** `String` — The Moov signature
    
</dd>
</dl>

<dl>
<dd>

**xTimestamp:** `String` — The Moov timestamp
    
</dd>
</dl>

<dl>
<dd>

**xNonce:** `String` — The Moov nonce
    
</dd>
</dl>

<dl>
<dd>

**xWebhookId:** `String` — The Moov webhook ID
    
</dd>
</dl>

<dl>
<dd>

**request:** `MoovBankAccountCallbackBody` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Oatfi
<details><summary><code>client.oatfi.oatfiCallback(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.oatfi().oatfiCallback(
    OatfiUnderwritingCallbackBody
        .builder()
        .data(
            OatfiUnderwritingData
                .builder()
                .productId("productId")
                .businessExternalId("businessExternalId")
                .status(UnderwritingStatus.APPROVED)
                .creditLimit(1)
                .sharedCreditLimit(1)
                .build()
        )
        .type("type")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `OatfiUnderwritingCallbackBody` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Ocr
<details><summary><code>client.ocr.ocr(request) -> OcrResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Run OCR on an Base64 encoded image or PDF. This endpoint will block until the OCR is complete.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ocr().ocr(
    OcrRequest
        .builder()
        .mimeType("image/png")
        .image("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAgAAAAIAQMAAAD+wSzIAAAABlBMVEX///+/v7+jQ3Y5AAAADklEQVQI12P4AIX8EAgALgAD/aNpbtEAAAAASUVORK5CYII")
        .vendorNetwork(VendorNetwork.ENTITY)
        .entityId("ent_8f86116b-3b4d-4ded-99ef-3bc929d8c33c")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `OcrRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ocr.runAsyncOcr(request) -> OcrAsyncResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Run OCR on an Base64 encoded image or PDF. This endpoint will return immediately and the OCR will be processed asynchronously.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ocr().runAsyncOcr(
    OcrRequest
        .builder()
        .mimeType("image/png")
        .image("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAgAAAAIAQMAAAD+wSzIAAAABlBMVEX///+/v7+jQ3Y5AAAADklEQVQI12P4AIX8EAgALgAD/aNpbtEAAAAASUVORK5CYII")
        .vendorNetwork(VendorNetwork.ENTITY)
        .entityId("ent_8f86116b-3b4d-4ded-99ef-3bc929d8c33c")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `OcrRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ocr.getAsyncOcr(jobId) -> OcrJobResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the status and results of an asynchronous OCR job.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ocr().getAsyncOcr("ocr_8f86116b-3b4d-4ded-99ef-3bc929d8c33c");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ocr.cloudMailinWebhook(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ocr().cloudMailinWebhook(
    CloudMailinRequest
        .builder()
        .headers(new 
            HashMap<String, Object>() {{put("key", "value");
            }})
        .envelope(
            CloudMailinEnvelope
                .builder()
                .to("to")
                .recipients(
                    new ArrayList<String>(
                        Arrays.asList("recipients", "recipients")
                    )
                )
                .from("from")
                .heloDomain("helo_domain")
                .remoteIp("remote_ip")
                .spf(new 
                    HashMap<String, Object>() {{put("key", "value");
                    }})
                .tls(true)
                .tlsCipher("tls_cipher")
                .md5("md5")
                .build()
        )
        .attachments(
            new ArrayList<CloudMailinAttachment>(
                Arrays.asList(
                    CloudMailinAttachment
                        .builder()
                        .content("content")
                        .url("url")
                        .fileName("file_name")
                        .contentType("content_type")
                        .size(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .disposition(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .contentId(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .build(),
                    CloudMailinAttachment
                        .builder()
                        .content("content")
                        .url("url")
                        .fileName("file_name")
                        .contentType("content_type")
                        .size(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .disposition(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .contentId(new 
                            HashMap<String, Object>() {{put("key", "value");
                            }})
                        .build()
                )
            )
        )
        .plain("plain")
        .html("html")
        .replyPlain("reply_plain")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CloudMailinRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ocr.processAsyncOcrInternal(request) -> PubSubResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Internal endpoint for processing async OCR jobs via Pub/Sub messages
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ocr().processAsyncOcrInternal(
    PubSubRequest
        .builder()
        .message(new 
            HashMap<String, Object>() {{put("key", "value");
            }})
        .subscription("subscription")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `PubSubRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Organization NotificationConfiguration
<details><summary><code>client.organization.notificationConfiguration.getAll() -> List&lt;NotificationConfigurationResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve all notification configurations
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().notificationConfiguration().getAll();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organization.notificationConfiguration.get(notificationType) -> NotificationConfigurationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve notification configuration for this notification type
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().notificationConfiguration().get(NotificationType.INVOICE_APPROVAL_NEEDED);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organization.notificationConfiguration.update(notificationType, request) -> NotificationConfigurationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update notification configuration for this notification type
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().notificationConfiguration().update(
    NotificationType.INVOICE_APPROVAL_NEEDED,
    NotificationConfigurationRequest.invoice(
        InvoiceNotificationConfigurationRequest
            .builder()
            .url("url")
            .subject("subject")
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `NotificationConfigurationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.organization.notificationConfiguration.reset(notificationType)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Reset notification configuration for this notification type
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.organization().notificationConfiguration().reset(NotificationType.INVOICE_APPROVAL_NEEDED);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**notificationType:** `NotificationType` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## PaymentGateway Process
<details><summary><code>client.paymentGateway.process.find() -> SearchPaymentGatewayProcessJobsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search payment gateway process jobs
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().find(
    SearchPaymentGatewayProcessJobsRequest
        .builder()
        .status(PaymentGatewayJobStatus.FAILED)
        .startDate(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endDate(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**status:** `Optional<PaymentGatewayJobStatus>` — Filter jobs by status
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter for job creation time
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter for job creation time
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<PaymentGatewayJobOrderByField>` — Field to order jobs by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order jobs by. Defaults to desc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of jobs to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the job to start after. If not provided, the first page of jobs will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.process.create(request) -> ProcessPaymentGatewayResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create a job to process a payment through a payment gateway
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().create(
    ProcessPaymentGatewayRequest.document(
        ProcessPaymentGatewayRequestDocument
            .builder()
            .document("data:application/pdf;base64,JVBERi0xLjEKJcKlwrHDqwoKMSAwIG9iagogIDw8IC9UeXBlIC9DYXRhbG9nCiAgICAgL1BhZ2VzIDIgMCBSCiAgPj4KZW5kb2JqCgoyIDAgb2JqCiAgPDwgL1R5cGUgL1BhZ2VzCiAgICAgL0tpZHMgWzMgMCBSXQogICAgIC9Db3VudCAxCiAgICAgL01lZGlhQm94IFswIDAgMzAwIDE0NF0KICA+PgplbmRvYmoKCjMgMCBvYmoKICA8PCAgL1R5cGUgL1BhZ2UKICAgICAgL1BhcmVudCAyIDAgUgogICAgICAvUmVzb3VyY2VzCiAgICAgICA8PCAvRm9udAogICAgICAgICAgIDw8IC9GMQogICAgICAgICAgICAgICA8PCAvVHlwZSAvRm9udAogICAgICAgICAgICAgICAgICAvU3VidHlwZSAvVHlwZTEKICAgICAgICAgICAgICAgICAgL0Jhc2VGb250IC9UaW1lcy1Sb21hbgogICAgICAgICAgICAgICA+PgogICAgICAgICAgID4+CiAgICAgICA+PgogICAgICAvQ29udGVudHMgNCAwIFIKICA+PgplbmRvYmoKCjQgMCBvYmoKICA8PCAvTGVuZ3RoIDU1ID4+CnN0cmVhbQogIEJUCiAgICAvRjEgMTggVGYKICAgIDAgMCBUZAogICAgKEhlbGxvIFdvcmxkKSBUagogIEVUCmVuZHN0cmVhbQplbmRvYmoKCnhyZWYKMCA1CjAwMDAwMDAwMDAgNjU1MzUgZiAKMDAwMDAwMDAxOCAwMDAwMCBuIAowMDAwMDAwMDc3IDAwMDAwIG4gCjAwMDAwMDAxNzggMDAwMDAgbiAKMDAwMDAwMDQ1NyAwMDAwMCBuIAp0cmFpbGVyCiAgPDwgIC9Sb290IDEgMCBSCiAgICAgIC9TaXplIDUKICA+PgpzdGFydHhyZWYKNTY1CiUlRU9GCg==")
            .cardDetails(
                ProcessPaymentGatewayCardDetails.direct(
                    ProcessPaymentGatewayCardDetailsDirect
                        .builder()
                        .firstName("John")
                        .lastName("Doe")
                        .cardNumber("4242424242424242")
                        .expirationMonth(10)
                        .expirationYear(2025)
                        .cvv("123")
                        .postalCode("12345")
                        .country(CountryCode.US)
                        .achDetails(
                            ProcessPaymentGatewayAchDetails
                                .builder()
                                .routingNumber("123456789")
                                .accountNumber("987654321")
                                .accountName("John Doe")
                                .build()
                        )
                        .build()
                )
            )
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ProcessPaymentGatewayRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.process.get(jobId) -> ProcessPaymentGatewayResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the status of a payment gateway processing job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().get("job_1a92b5f7-f522-435e-a953-fd649363730a");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — The ID of the payment gateway processing job
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.process.processCardEtl(request) -> List&lt;ProcessCardEtlResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Process a card ETL job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().processCardEtl(
    ProcessCardEtlRequest
        .builder()
        .type(PaymentMethodType.CUSTOM)
        .document("document")
        .batchSize(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ProcessCardEtlRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.process.trigger(request) -> TriggerPaymentGatewayProcessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Trigger a payment gateway process job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().trigger(
    TriggerPaymentGatewayProcessRequest
        .builder()
        .jobId("jobId")
        .manual(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `TriggerPaymentGatewayProcessRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.process.processPubsub(request) -> PubSubResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Internal endpoint for processing processing jobs via Pub/Sub messages
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().processPubsub(
    PubSubRequest
        .builder()
        .message(new 
            HashMap<String, Object>() {{put("key", "value");
            }})
        .subscription("subscription")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `PubSubRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.process.processDataExtraction(request) -> ProcessDataExtractionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Internal endpoint for processing data extraction for a payment gateway process job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().process().processDataExtraction(
    ProcessDataExtractionRequest
        .builder()
        .jobId("jobId")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ProcessDataExtractionRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## PaymentGateway Validate
<details><summary><code>client.paymentGateway.validate.find() -> SearchPaymentGatewayValidationJobsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search payment gateway validation jobs
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().validate().find(
    SearchPaymentGatewayValidationJobsRequest
        .builder()
        .status(PaymentGatewayJobStatus.FAILED)
        .startDate(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endDate(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**status:** `Optional<PaymentGatewayJobStatus>` — Filter jobs by status
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Start date filter for job creation time
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — End date filter for job creation time
    
</dd>
</dl>

<dl>
<dd>

**orderBy:** `Optional<PaymentGatewayJobOrderByField>` — Field to order jobs by. Defaults to CREATED_AT.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<OrderDirection>` — Direction to order jobs by. Defaults to desc.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of jobs to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the job to start after. If not provided, the first page of jobs will be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.validate.create(request) -> ValidatePaymentGatewayResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create a job to validate a payment gateway
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().validate().create(
    ValidatePaymentGatewayRequest.document(
        ValidatePaymentGatewayRequestDocument
            .builder()
            .document("data:application/pdf;base64,JVBERi0xLjEKJcKlwrHDqwoKMSAwIG9iagogIDw8IC9UeXBlIC9DYXRhbG9nCiAgICAgL1BhZ2VzIDIgMCBSCiAgPj4KZW5kb2JqCgoyIDAgb2JqCiAgPDwgL1R5cGUgL1BhZ2VzCiAgICAgL0tpZHMgWzMgMCBSXQogICAgIC9Db3VudCAxCiAgICAgL01lZGlhQm94IFswIDAgMzAwIDE0NF0KICA+PgplbmRvYmoKCjMgMCBvYmoKICA8PCAgL1R5cGUgL1BhZ2UKICAgICAgL1BhcmVudCAyIDAgUgogICAgICAvUmVzb3VyY2VzCiAgICAgICA8PCAvRm9udAogICAgICAgICAgIDw8IC9GMQogICAgICAgICAgICAgICA8PCAvVHlwZSAvRm9udAogICAgICAgICAgICAgICAgICAvU3VidHlwZSAvVHlwZTEKICAgICAgICAgICAgICAgICAgL0Jhc2VGb250IC9UaW1lcy1Sb21hbgogICAgICAgICAgICAgICA+PgogICAgICAgICAgID4+CiAgICAgICA+PgogICAgICAvQ29udGVudHMgNCAwIFIKICA+PgplbmRvYmoKCjQgMCBvYmoKICA8PCAvTGVuZ3RoIDU1ID4+CnN0cmVhbQogIEJUCiAgICAvRjEgMTggVGYKICAgIDAgMCBUZAogICAgKEhlbGxvIFdvcmxkKSBUagogIEVUCmVuZHN0cmVhbQplbmRvYmoKCnhyZWYKMCA1CjAwMDAwMDAwMDAgNjU1MzUgZiAKMDAwMDAwMDAxOCAwMDAwMCBuIAowMDAwMDAwMDc3IDAwMDAwIG4gCjAwMDAwMDAxNzggMDAwMDAgbiAKMDAwMDAwMDQ1NyAwMDAwMCBuIAp0cmFpbGVyCiAgPDwgIC9Sb290IDEgMCBSCiAgICAgIC9TaXplIDUKICA+PgpzdGFydHhyZWYKNTY1CiUlRU9GCg==")
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ValidatePaymentGatewayRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.validate.get(jobId) -> ValidatePaymentGatewayResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the status of a payment gateway validation job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().validate().get("job_1a92b5f7-f522-435e-a953-fd649363730a");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — The ID of the payment gateway validation job
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.validate.trigger(request) -> TriggerPaymentGatewayValidationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Trigger a payment gateway validation job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().validate().trigger(
    TriggerPaymentGatewayValidationRequest
        .builder()
        .jobId("jobId")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `TriggerPaymentGatewayValidationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.paymentGateway.validate.processPubsub(request) -> PubSubResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Internal endpoint for processing validation jobs via Pub/Sub messages
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentGateway().validate().processPubsub(
    PubSubRequest
        .builder()
        .message(new 
            HashMap<String, Object>() {{put("key", "value");
            }})
        .subscription("subscription")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `PubSubRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## PaymentMethods
<details><summary><code>client.paymentMethods.find() -> PaymentMethodWithEntityFindResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.paymentMethods().find(
    FindPaymentMethodsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of payment methods to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the payment method to start after. If not provided, the first page of payment methods will be returned.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<PaymentMethodType>` — Type of payment method to filter
    
</dd>
</dl>

<dl>
<dd>

**entityId:** `Optional<String>` — Entity ID to filter
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ProcessInvoice
<details><summary><code>client.processInvoice.processInvoices(request) -> List&lt;InvoiceResponse&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Trigger invoice processing
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.processInvoice().processInvoices(
    ProcessInvoiceRequest
        .builder()
        .invoiceIds(
            new ArrayList<String>(
                Arrays.asList("invoiceIds", "invoiceIds")
            )
        )
        .dryRun(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `ProcessInvoiceRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Transaction
<details><summary><code>client.transaction.find() -> FindTransactionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search transactions
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.transaction().find(
    FindTransactionsRequest
        .builder()
        .startDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .endDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .limit(10)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityId:** `Optional<String>` — Filter transactions by the ID or foreign ID of the entity that created the transaction.
    
</dd>
</dl>

<dl>
<dd>

**entityGroupId:** `Optional<String>` — Filter transactions by the ID or foreign ID of the entity group that the entity belongs to.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — CREATED_AT Start date filter.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — CREATED_AT End date filter.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of transactions to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the transactions to start after. If not provided, the first page of transactions will be returned.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find transactions by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter transactions by invoice metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter transactions by invoice line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter transactions by invoice line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter transactions by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter transactions by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter transactions by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**transactionId:** `Optional<String>` — Filter transactions by transaction ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<TransactionStatus>` — Transaction status to filter on
    
</dd>
</dl>

<dl>
<dd>

**transactionType:** `Optional<TransactionType>` — Filter transactions by transaction type
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter transactions by creator user ID. Does not work, do not use.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.transaction.get(transactionId) -> TransactionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get Transaction
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.transaction().get("trx_bb08e72f-19f8-45f3-bcf9-46fdc46cb2f4");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**transactionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.transaction.download() -> BulkDownloadResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a URL to download transactions as a CSV/JSON file.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.transaction().download(
    DownloadTransactionsRequest
        .builder()
        .format(BulkDownloadFormat.CSV)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**format:** `Optional<BulkDownloadFormat>` — Format of the file to download. Defaults to CSV.
    
</dd>
</dl>

<dl>
<dd>

**entityId:** `Optional<String>` — Filter transactions by the ID or foreign ID of the entity that created the transaction.
    
</dd>
</dl>

<dl>
<dd>

**entityGroupId:** `Optional<String>` — Filter transactions by the ID or foreign ID of the entity group that the entity belongs to.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — CREATED_AT Start date filter.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — CREATED_AT End date filter.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of transactions to return. Limit can range between 1 and 100, and the default is 10.
    
</dd>
</dl>

<dl>
<dd>

**startingAfter:** `Optional<String>` — The ID of the transactions to start after. If not provided, the first page of transactions will be returned.
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Find transactions by vendor name, invoice number, check number, or amount. Partial matches are supported.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<MetadataFilter>` — Filter transactions by invoice metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemMetadata:** `Optional<MetadataFilter>` — Filter transactions by invoice line item metadata. Each filter will be applied as an AND condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**lineItemGlAccountId:** `Optional<String>` — Filter transactions by invoice line item GL account ID. Each filter will be applied as an OR condition. Duplicate keys will be ignored.
    
</dd>
</dl>

<dl>
<dd>

**payerId:** `Optional<String>` — Filter transactions by payer ID or payer foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**vendorId:** `Optional<String>` — Filter transactions by vendor ID or vendor foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**invoiceId:** `Optional<String>` — Filter transactions by invoice ID or invoice foreign ID.
    
</dd>
</dl>

<dl>
<dd>

**transactionId:** `Optional<String>` — Filter transactions by transaction ID.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<TransactionStatus>` — Transaction status to filter on
    
</dd>
</dl>

<dl>
<dd>

**transactionType:** `Optional<TransactionType>` — Filter transactions by transaction type
    
</dd>
</dl>

<dl>
<dd>

**creatorUserId:** `Optional<String>` — Filter transactions by creator user ID. Does not work, do not use.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
