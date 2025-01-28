
#!/bin/bash
# Loop through all Java files in the current directory
for file in *.java; do
  # Check if it is a file
  if [ -f "$file" ]; then
    # Delete the first line in each file
    sed -i '1d' "$file"
    echo "Processed $file"
  fi
done
