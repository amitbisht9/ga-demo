import xml.etree.ElementTree as ET
import json

# Parse the XML file
tree = ET.parse('results/output.xml')
root = tree.getroot()

# Define a list to store test results
test_results = []

# Iterate over test cases
for test_case in root.findall('.//test'):
    test_id = test_case.get('id')
    test_name = test_case.get('name')
    test_duration_str = test_case.find('.//status').get('elapsed')
    test_duration = float(test_duration_str)
    test_status = test_case.find('.//status').get('status')

    # Convert elapsed time to milliseconds without decimal points
    test_duration = int(float(test_duration_str) * 1000)

    # Set test_status to "Passed" if status is "PASS", otherwise set it to "Failed"
    if test_status == "PASS":
        test_status = "Passed"
    elif test_status == "FAIL":
        test_status = "Failed"
    else
        test_status = "UnKnown"

    # Create a dictionary for each test result and append it to the list
    test_result = {
        "test_id": test_id,
        "test_name": test_name,
        "test_duration": test_duration,
        "test_status": test_status
    }
    test_results.append(test_result)

# Convert the list of dictionaries to JSON format
output_json = json.dumps(test_results)

# Print the JSON output
print(output_json)