#!/bin/bash
# The text you want to add to the first line
text_to_add="package learning_ds.src;"

# Loop through all Java files in the current directory
for file in *.java; do
  # Check if it is a file
  if [ -f "$file" ]; then
    # Create a temporary file
    temp_file=$(mktemp)
    # Add the text to the first line and then append the rest of the file
    echo "$text_to_add" > "$temp_file"
    cat "$file" >> "$temp_file"
    # Move the temporary file to the original file
    mv "$temp_file" "$file"
    echo "Processed $file"
  fi
done
