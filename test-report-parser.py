from xml.etree import ElementTree as ET

# Parse the output.xml file
tree = ET.parse('results/output.xml')
root = tree.getroot()

# Find all test case elements
test_cases = root.findall('.//test')

# Initialize a list to store test case details
test_case_details = []

# Iterate over test cases and extract details
for test_case in test_cases:
    test_id = test_case.find('tag').text
    test_name = test_case.get('name')
    test_duration = float(test_case.find('status').get('elapsed'))  # Convert duration to float
    test_status = test_case.find('status').get('status')
    
    # Store test case details as a dictionary
    test_case_info = {
        "test_id": test_id,
        "test_name": test_name,
        "test_duration": test_duration,
        "test_status": test_status
    }
    
    # Append the dictionary to the list
    test_case_details.append(test_case_info)

# Print the list of dictionaries
print(test_case_details)