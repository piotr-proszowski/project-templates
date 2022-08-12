#!/bin/sh -e

PROJECT_TEMPLATES_DIR=~/project-templates
MAIN_COLOR=212
PROJECT_TEMPLATE_NAME=projectemplate

function generateRandomName() {
  echo $(node_modules/project-name-generator/src/generator-bin.js | grep dashed | awk '{print $2}' | tr -d "\'" | tr -d ",")
}

function setUpProject() {
  projectPath=$1
  chosenTemplate=$2
  chosenProjectName=$3
  mkdir -p $projectPath
  cp -r ~/project-templates/templates/$chosenTemplate/* $projectPath
  fd -x sd $PROJECT_TEMPLATE_NAME $chosenProjectName {}
}

echo "1. Choose a template:"
chosenTemplate=$(ls $PROJECT_TEMPLATES_DIR/templates | gum choose)
echo "Template $(gum style --foreground $MAIN_COLOR $chosenTemplate) has been chosen."

echo "2. Choose project name:"
randomName=$(generateRandomName)
chosenProjectName=$(gum input --prompt.foreground=$MAIN_COLOR --prompt="Project name: " --placeholder="$randomName")
if [ -z "$chosenProjectName" ];
  then chosenProjectName="$randomName"
fi
echo "Chosen $(gum style --foreground $MAIN_COLOR $chosenProjectName) as a project name. Sounds great!😎"

echo "3. Choose location for your new project:"
chosenLocation=$(gum input --prompt.foreground=$MAIN_COLOR --prompt="Location: " --placeholder="$HOME/Workshop/")
if [ -z "$chosenLocation" ];
  then chosenLocation="$HOME/Workshop/"
fi
echo "🤖 Chosen $(gum style --foreground $MAIN_COLOR $chosenLocation) as a location."

projectPath=${chosenLocation}${chosenProjectName}

# gum spin -s line --title "Setting up the project" -- couldn't make spinner working, but it would be cool!
setUpProject $projectPath $chosenTemplate $chosenProjectName

echo "We're ready to go. Let's start the party 🥳"
echo "Template $(gum style --foreground $MAIN_COLOR $chosenTemplate) has been copied into: $(gum style --foreground $MAIN_COLOR $projectPath)"
echo $projectPath | pbcopy
echo "$projectPath has been copied to clipboard!"
