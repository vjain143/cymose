package com.cymose.stix.sdk.model;

import com.cymose.stix.sdk.model.cdts.ExternalReference;
import com.cymose.stix.sdk.model.sdos.Indicator;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StixBundleTest
{
    @Test
    public void createIndicator()
    {
        String wanted = "{\"type\": \"bundle\",\n" +
                " \"id\": \"bundle--44af6c39-c09b-49c5-9de2-394224b04982\",\n" +
                " \"spec_version\": \"2.0\",\n" +
                " \"objects\": [{\"type\": \"indicator\",\n" +
                "              \"id\": \"indicator--33fe3b22-0201-47cf-85d0-97c02164528d\",\n" +
                "              \"created\": \"2014-05-08T09:00:00.000Z\",\n" +
                "              \"modified\": \"2014-05-08T09:00:00.000Z\",\n" +
                "              \"name\": \"IP Address for known C2 channel\",\n" +
                "              \"labels\": [\"malicious-activity\"],\n" +
                "              \"pattern\": \"[ipv4-addr:value = '10.0.0.0']\",\n" +
                "              \"valid_from\": \"2014-05-08T09:00:00.000000Z\"}]\n" +
                "}";

        String expected = "{\"type\":\"bundle\",\"id\":\"-1478754369\",\"spec_version\":\"2.0\",\"objects\":[{\"name\":\"IP Address for known C2 channel\",\"pattern\":\"[ipv4-addr:value \\u003d \\u002710.0.0.0\\u0027]\",\"created_by_ref\":\"identity-id\",\"revoked\":false,\"labels\":[\"malicious-activity\"],\"external_references\":[{\"source_name\":\"Threat Connect\",\"url\":\"https://api.threatconnect.com/\"}],\"id\":\"-799239776\",\"type\":\"indicator\"}]}";

        Gson gson = new Gson();

        Indicator indicator = new Indicator();
        indicator.setId(String.valueOf(indicator.hashCode()));
        indicator.setName("IP Address for known C2 channel");
        indicator.setPattern("[ipv4-addr:value = '10.0.0.0']");
        //indicator.created()
        //indicator.modified()
        List<String> labels = new ArrayList<String>();
        labels.add("malicious-activity");
        indicator.setLabels(labels);
        List<ExternalReference> externalReferences = new ArrayList<ExternalReference>();
        ExternalReference externalReference = new ExternalReference();
        externalReference.setSourceName("Threat Connect");
        externalReference.setUrl("https://api.threatconnect.com/");
        externalReferences.add(externalReference);
        indicator.setExternalReferences(externalReferences);
        //indicator.validFrom("");
        StixBundle bundle = new StixBundle();
        bundle.setId(String.valueOf(bundle.hashCode()));
        bundle.setSpecVersion("2.0");
        bundle.addObjectsItem(indicator);
        String output = gson.toJson(bundle);
        assertEquals(output,expected);
    }
}
